package com.tjtc.day02;

public class Dome4 {
    public static void main(String[] args) {
        // 三元运算符    （布尔值类型的条件）? 如果成立就执行这部分逻辑 : 如果不成立就执行这一部分逻辑
        int x = 0;
        int y = 1;
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        System.out.println(max);
        // 三元运算写法
        int max1 = x>y ? x : y;
        System.out.println(max1);

    }
}
