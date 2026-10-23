import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5001);

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true
        );

        out.println("Hello Java");
        System.out.println("Echo: " + in.readLine());

        socket.close();
    }
}