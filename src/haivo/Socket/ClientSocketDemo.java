package haivo.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by haivo on 2016/4/23.
 */
public class ClientSocketDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",1024);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("Hello ServerSocket");

            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
