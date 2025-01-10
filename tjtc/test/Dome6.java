package com.tjtc.test;

public class Dome6 {

    public static void main(String[] args) {
        /*
        * 数据类型转化  自动转化(用大的水桶去装小水桶的水，不会照成水的溢出)不会照成精度的一个丢失 、
        *            强制转化（把大水桶的水导入到小水桶里）照成精度的丢失
        *
        *   byte short char ->  int -> long -> float -> double
        * */
        byte a = 1;
        int b = a;


        int c = 12333;
        byte  d = (byte) c; // -128 - 127
        System.out.println(d);
    }
}
