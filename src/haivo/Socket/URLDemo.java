package haivo.Socket;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by haivo on 2016/4/22.
 */
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com");
            System.out.println(url.getFile());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getUserInfo());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
