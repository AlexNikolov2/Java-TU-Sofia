import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dealer implements Runnable{

    private static ArrayList<Car> cars;
    private HashMap<Data, Object> data;
    private Socket socket;
    private Scanner scanner;
    private Scanner reader;
    private PrintStream printStream;

    
   @Override
   public void run(){
    try{
        var in = socket.getInputStream();
        var out = socket.getOutputStream();

        scanner = new Scanner(system.in);

        reader = new Scanner(in);
        printStream = new PrintStream(out);
    }
    catch(IOException e){
        e.printStackTrace();
    }

    scanner.close();
    reader.close();
    printStream.close();
   }

}

//tva e za troika