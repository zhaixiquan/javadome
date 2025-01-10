package com.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        Socket accept = ss.accept();
        System.out.println("客户端已连接");
        BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String str;
        if ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
        accept.close();
        ss.close();

    }
}
