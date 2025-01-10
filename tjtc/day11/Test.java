package com.tjtc.day11;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("小黑");
        dog.setColor("黑色");
        System.out.println("小狗的名字叫："+dog.getName()+",小狗今年"+dog.getAge()+"岁了"+"，颜色是:"+dog.getColor());
        dog.action();
    }
}
