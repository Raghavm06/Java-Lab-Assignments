import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5001);
        System.out.println("Echo server waiting...");

        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true
        );

        String message = in.readLine();
        out.println(message);

        socket.close();
        server.close();
    }
}   