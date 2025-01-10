package com.tjtc.day16;

// 多态的表现形式是父类引用指向子类
public class Test {

    public static void main(String[] args) {
        // 这种形式就是父类的引用指向了子类
        // 向上转型自动转化
        Animal animal = (Animal) new Dog();
        Animal animal1 = (Animal) new Cat();
        // 向下转型要强转
        animal.test(animal);
        // 如果对象类型不是不配，会抛出ClassCastException(类型转化异常)
        animal.test(animal1);


    }


}
