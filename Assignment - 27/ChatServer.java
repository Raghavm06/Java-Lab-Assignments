import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server waiting...");

        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true
        );

        String message = in.readLine();
        System.out.println("Client: " + message);

        out.println("Message received by server.");

        socket.close();
        server.close();
    }
}