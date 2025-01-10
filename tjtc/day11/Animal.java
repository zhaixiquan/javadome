package com.tjtc.day11;

/**
 * 方法的重载  （方法名相同，参数列表不同（参数个数，顺序，类型），与返回值值无关）
 * 方法的重写
 */
public class Animal {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void action() {
        System.out.println("小动物会叫。。。");
    }
}
