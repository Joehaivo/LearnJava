package haivo.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by haivo on 2016/4/23.
 */
public class ServerSocketDemo {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1024);
            System.out.println("准备接收数据");
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("客户端说: "+ bufferedReader.readLine());

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
