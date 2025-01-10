package com.day13;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws IOException {
        InetAddress byName = InetAddress.getByName("WIN-TRSGSJ41HRU");
        System.out.println(byName);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println(localHost.isReachable(3000));

        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);
        System.out.println(byName1.isReachable(3000));
    }
}
