package com.day13.dome01;




import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        // 创建服务端对象
        DatagramSocket ds = new DatagramSocket(8888);
        // 获取发送端的数据并输出
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        while (true) {
            new MyThread(ds, dp).start();
        }


    }
}
