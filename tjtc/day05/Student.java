package com.tjtc.day05;

public class Student {

    String name;

    int age;

    public void read(){
        System.out.println(name + "正在学习,今年" +age + "岁了");
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}
