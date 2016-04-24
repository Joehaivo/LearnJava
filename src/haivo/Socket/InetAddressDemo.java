package haivo.Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by haivo on 2016/4/22.
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostName()+inetAddress.getHostAddress());
        System.out.println(inetAddress);
    }
}
