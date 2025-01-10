package com.tjtc.day03;

// 方法的重载
public class Dome3 {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2.0);
        add(1.0,2);
    }

    /*
    *
    * 方法的重载：
    *           1.方法名相同，
    *           2.参数列表不同(参数的个数、参数的类型、参数的顺序)
    *           3.与返回值无关
    * */

    // 进行2个书相加
    public static double add(int a ,int b) {
        System.out.println("调用的是int a,int b");
        return  a + b;
    }



    public static double add (int a ,double b) {
        System.out.println("这个是调用的  int a,double b方法");
        return a + b;
    }

    public static double add (double a,int b) {
        System.out.println("这个是调用的  double a,int b方法");
        return a + b;
    }

    public static double add (int a ,int b,int c) {
        System.out.println("这个调用的是3个参数的方法");
        return  a + b + c;
    }

}
