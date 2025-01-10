package com.day13.dome01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyThread extends Thread{

    private DatagramSocket ds;
    private DatagramPacket dp;

    MyThread(DatagramSocket ds,DatagramPacket dp){
        this.ds = ds;
        this.dp = dp;
    }
    @Override
    public void run() {
        try {
            ds.receive(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(dp.getData())+"===============");
    }
}
