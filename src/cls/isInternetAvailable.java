/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author Isuru
 */
public class isInternetAvailable {

    public static boolean testInet(String site) {
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress(site, 80);
        try {
            sock.connect(addr, 3000);
            return true;
        } catch (IOException e) {
            return false;
        } finally {
            try {
                sock.close();
            } catch (IOException e) {
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Online: " + (testInet("google.com") /*|| testInet("amazon.com")*/));
    }
}
