package com.tjtc.day02;

public class Dome9 {
    // 使用嵌套循环打印9*9乘法表
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*"+ i + "=" + i*j +" ");
            }
            System.out.println();
        }
    }
}
