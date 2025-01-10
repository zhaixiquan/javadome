package com.tjtc.day04;

public class Student {
    // 成员变量 属性
    String name;

    int age = 18;

    String sex;

    // 成员方法  行为

    public void read() {
        // 当方法中使用了一个变量，这个变量名称既在成员变量中，又在调用的方法内，这时候默认使用的是局部变量，如果想使用成员变量，要在属性前加上this关键字
        int age = 19; // 局部变量
        System.out.println(name+"在学习，今年"+this.age +"岁了");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.read();
    }

}
