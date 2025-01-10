package com.tjtc.day08;

public class Student {

    private String name;

    private int age;


    // 默认就有的，属于隐藏的构造
    public Student(){
        return;
    }

    public Student(String str,int number) {
        name = str;
        age = number;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("输入的年龄有误");
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void study(){
        System.out.println(name+"在学习，今年"+age+"岁了");
    }
}
