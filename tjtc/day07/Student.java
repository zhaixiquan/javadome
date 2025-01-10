package com.tjtc.day07;

public class Student {

    String name;

    int age;

    public void read() {
        System.out.println(name+"在学习,今年"+age+"岁");
    }


    public static void main(String[] args) {
        Student student = new Student();
        student.age = 18;
        student.name = "张三";
        student.read();



        Student student1 = new Student();
        student1.name = "李四";
        student1.age = 22;
        student1.read();

        student = student1;

        student.read(); // 这个方法会输出什么



    }
}
