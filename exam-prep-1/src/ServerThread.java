import java.util.*;
import java.io.*;
import java.net.*;

public class ServerThread implements Runnable {
    private static ArrayList<Account> accounts;
    private HashMap<Data, Object> sessionData;
    private Socket socket;
    private Scanner reader;
    private Scanner scanner;
    private PrintStream printStream;

    public ServerThread(Socket server) throws IOException {
        accounts = new ArrayList<Account>() {{
            add(new Account(123456789, "1234", "100"));
            add(new Account(987654321, "4321", "10000"));
            add(new Account(111111111, "1111", "1000"));
        }};
        
        sessionData = new HashMap<Data, Object>();
        socket = server;
    }

    @Override 
    public void run(){
        try{
            var out = socket.getOutputStream();
            var in = socket.getInputStream();

            scanner = new Scanner(System.in);

            reader = new Scanner(in);
            printStream = new PrintStream(out);
        }
        catch(IOException e){
            e.printStackTrace();
        }

        ServerLogic();

        //put the closings in a try/catch

        reader.close();
        printStream.close();
        scanner.close();

    }

    public void SendMessage(Commands command, String message)
    {
        var thread = Thread.currentThread();
        System.out.println("(S" + thread.getId() + ")[" + command + "] " + message);
        printStream.printf("%s:%s\n", command, message);
    }

    public void SendStatus(Commands command, Status status){
        var thread = Thread.currentThread();
        System.out.println("(S" + thread.getId() + ")[" + command + "] " + status);
        printStream.printf("%s:%s\n", command, status);
    }

    public void GetMessage(){
        var thread = Thread.currentThread();
        String wholeMessage = reader.nextLine();
        String[] commandsArray = wholeMessage.split(":");
        Commands command = Commands.valueOf(commandsArray[0]);
        String args = commandsArray[1];

        ProcessMessage(command, args);
    }

    public void ProcessMessage(Commands command, String args){
        switch (command)
        {
            case WELCOME:
                SendStatus(Commands.WELCOME, Status.OK);
                break;
            case ACCOUNT_NUMBER:
                Status message = accounts
                                    .stream()
                                    .anyMatch(account -> account.getAccountNumber().equals(args)) ? Status.OK : Status.ERROR;
                SendStatus(Commands.ACCOUNT_NUMBER, message);
                break;
            case PIN:
                var accountNumber = sessionData.get(Data.ACCOUNT_NUMBER);
                var account = accounts.stream().filter(acc -> acc.getAccountNumber().equals(accountNumber)).findFirst().get();
                message = account.checkPin(args) ? Status.OK : Status.ERROR;
                if (message == Status.OK) sessionData.put(Data.ACCOUNT, account);
                SendStatus(Commands.PIN, message);
                break;
            case WITHDRAW:
                try {
                    account = (Account) sessionData.get(Data.ACCOUNT);
                    account.withdraw(Integer.parseInt(args));
                    SendStatus(Commands.WITHDRAW, Status.OK);
                } catch (Exception e) {
                    SendStatus(Commands.WITHDRAW, Status.ERROR);
                    break;
                }
                break;
            case DEPOSIT:
                try {
                    account = (Account) sessionData.get(Data.ACCOUNT);
                    account.deposit(Integer.parseInt(args));
                    SendStatus(Commands.DEPOSIT, Status.OK);
                } catch (Exception e) {
                    SendStatus(Commands.DEPOSIT, Status.ERROR);
                    break;
                }
                break;
            case GET_BALANCE:
                break;
            default:
                SendStatus(Commands.ERROR, Status.ERROR);
                break;
        }
    }

    public void ServerLogic()
    {
        SendMessage(Commands.WELCOME, "Welcome to the ATM");
        GetMessage();

        SendMessage(Commands.ASK_ACCOUNT_NUMBER, "Please enter your account number");
        GetMessage();

        SendMessage(Commands.ASK_PIN, "Please enter your PIN");
        GetMessage();

        SendMessage(Commands.GET_BALANCE, "Your balance is $100");
        GetMessage();

        SendMessage(Commands.DEPOSIT, "Please enter the amount to deposit");
        GetMessage();

        SendMessage(Commands.WITHDRAW, "Please enter the amount to withdraw");
        GetMessage();

        SendMessage(Commands.ERROR, "Error");
        GetMessage();
    }
}
