package com.tjtc.day14;

public class Test {
    public static void main(String[] args) {
        System.out.println(Animal.getID());
        Dog dog = new Dog();
        dog.info();
        dog.shout();
        dog.eat();
    }
}
