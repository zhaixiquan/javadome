package com.tjtc.day10;

public class Student {
    private String name;

    private int age;
    {
        System.out.println("这是调用了构造代码块");
    }

    static  {
        System.out.println("这个是静态代码块");
    }
    public void read(){
        System.out.println(name+"正在学习，今年"+age+"岁");
    }

    public Student() {
        System.out.println("这是调用无参构造代码");
    }

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
        this.read();
    }

    public static void info(){
        System.out.println("静态方法初始化了");
    }
}
