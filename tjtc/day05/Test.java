package com.tjtc.day05;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // 首先对象的创建是使用new 关键字
        // 先声明对象，再实例化
        // 这一部是先声明了一个对象
//        Student stu = null;
//        stu = new Student();
        // 在声明的时候直接去创建对象
        Student stu1 = new Student();


        // 先声明再创建
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Student stu = null;
        //  如果输入的这个数为奇数 我就创建一个空对象
        if (i%2 != 0) {
             stu = new Student();
        }else {
             stu = new Student("张三");
        }
        // 如果输入的这个数为偶数，我就将他的成员变量通过构造直接初始化


    }
}
