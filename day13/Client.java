package com.day13;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",7777);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好呀".getBytes());
        outputStream.close();
    }
}
