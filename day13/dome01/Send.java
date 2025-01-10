package com.day13.dome01;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {
        // 创建发送端对象
        DatagramSocket ds = new DatagramSocket();
        String str = "你好呀";
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        // 创建发送端数据包
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.getBytes().length,inetAddress,8888);
        ds.send(dp);

    }
}
