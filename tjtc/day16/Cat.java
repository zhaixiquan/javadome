package com.tjtc.day16;

public class Cat extends Animal{

    public void climb(){
        System.out.println("小猫会爬树");
    }

    @Override
    public void action() {
        System.out.println("小猫喵喵叫。。。");
    }
}
