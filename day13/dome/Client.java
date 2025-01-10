package com.day13.dome;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",7777);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好呀".getBytes());

        // 获取服务端数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));
        outputStream.close();
        inputStream.close();
        //outputStream.close();
        socket.close();
    }
}
