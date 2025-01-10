package com.tjtc.day02;

public class Dome6 {
    public static void main(String[] args) {
        // 死循环   永真循环
        // 造成内存的一处，然后抛出异常内存溢出异常
        int x = 1;
        while (x < 5) {
            x++;
            System.out.println(x);
        }
    }
}
