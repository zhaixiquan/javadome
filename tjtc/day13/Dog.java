package com.tjtc.day13;

// 对于成员属性，如果加上final修饰，在类初始化的时候必须被赋值，而且成员变量一但赋值就不能被修改
// 对于内部属性，初始时可以不赋值，但是赋值后就不能再进行赋值
public class Dog extends Animal{

    private final int age = 1;

    private final String name = "小黑";

    @Override
    public void action() {
        final int age;
        age = 5;
        //age = 6;
        final  String color;
        color = "黑色";
        //color = "黄色";

//        this.age = 1;
//        this.age = 2;
        //this.name = "小黄";
        System.out.println("小狗汪汪叫");
    }
}
