import java.io.*;
import java.net.*;
import java.util.*;

public class ServerThread implements Runnable {
    private static ArrayList<Book> books;
    private Socket socket;
    private Scanner scanner;
    private Scanner reader;
    private PrintStream printStream;

    @Override 
    public void run(){
        try{
            var input = socket.getInputStream();
            var output = socket.getOutputStream();

            scanner = new Scanner(System.in);
            reader = new Scanner(input);
            printStream = new PrintStream(output);
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args){
        LibraryAdmin admin = new LibraryAdmin();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Select option:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                System.out.print("Въведете заглавие на книга: ");
                String title = scanner.nextLine();
                admin.getBooks(title);
                case 2:
                System.out.print("Enter ID:");
                String id = scanner.nextLine();
                admin.addBookToRentedBooks(id);
                case 3:
                case 3:
                System.out.print("Въведете име на библиотека: ");
                String libraryName = scanner.nextLine();
                admin.getAllBooks(libraryName).forEach(System.out::println);
                break;

            case 0:
                System.out.println("Изход от системата.");
                return;

            default:
                System.out.println("Невалидна опция.");
            }
        }
    }
}
