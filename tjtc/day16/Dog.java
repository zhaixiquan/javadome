package com.tjtc.day16;

public class Dog extends Animal{

    public void lookHome(){
        System.out.println("小狗会看门");
    }

    @Override
    public void action() {
        System.out.println("小狗汪汪叫。。。");
    }
}
