import java.io.IOException;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        try(ServerSocket server = new ServerSocket(3030)){
            ExecutorService executor = Executors.newFixedThreadPool(3);
            while(true){
                Socket socket = server.accept();
                executor.execute(new ServerThread());
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
