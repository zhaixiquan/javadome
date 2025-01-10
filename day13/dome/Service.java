package com.day13.dome;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("服务端已创建");
        Socket accept = ss.accept();
        System.out.println("客户端已连接");
        // 读取客户端的数据
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));
        // 给客户端返回数据
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("服务端收到了".getBytes());

        inputStream.close();
        accept.close();
        ss.close();
    }
}
