package com.tjtc.day12;

public class Animal {
    String name = "父类";

    String age;

    public Animal() {
        System.out.println("调用了父类的空钩爪");
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void action(){
       // System.out.println("获取父类的name属性"+super.name);
       // System.out.println("动物发出叫声");
    }
}
