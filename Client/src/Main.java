import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        final int port = 8000;
        Socket socket = new Socket("localhost",port);

        //msg ekak yawanawa output stream eken
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Hi kohomathe");
    }
}