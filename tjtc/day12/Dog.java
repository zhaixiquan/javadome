package com.tjtc.day12;

public class Dog extends Animal{
    String color;

    String name = "张三";



//    public Dog(String color) {
//        //super(name, age);
//        this.color = color;
//    }


    public Dog() {
        System.out.println("子类构造执行了");
    }

    public Dog( String color) {
        this.color = color;
    }

    public void showName(){
        System.out.println(name);
    }

    @Override
    public void action() {
        System.out.println("获取父类的name属性"+super.name);
        super.action();
        System.out.println("小狗汪汪叫");
    }
}
