import java.net.ServerSocket;
import java.net.Socket;

public class Dealer{

    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(3030);
        Socket client = server.accept();

        
    }
   

}