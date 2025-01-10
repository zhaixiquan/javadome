package com.tjtc.day01;

public class Dome {
    public static void main(String[] args) {
        // ++  --  如果符号在前的话，先进行+1，然后再运算， 如果符号在后，先运算，再+1
        int a =1;
        System.out.println(a++);
        System.out.println(a);

        System.out.println("=============================");
        int b =1;
        System.out.println(++b);
        System.out.println(b);
        // 取模符号，其实就是要余数

        System.out.println(1%5);
    }
}
