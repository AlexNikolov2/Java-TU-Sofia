import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException{
        try (ServerSocket server = new ServerSocket(3030)) {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            while(true){
                Socket socket = server.accept();
                executor.execute(new Dealer());
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
    }
}
//i tva