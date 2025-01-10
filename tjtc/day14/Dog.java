package com.tjtc.day14;

public class Dog implements Animal,Action{

    @Override
    public void shout() {
        System.out.println("这个是shout方法");
    }

    @Override
    public void info() {
        System.out.println("这是info方法");
    }
}
