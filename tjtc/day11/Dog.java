package com.tjtc.day11;

public class Dog extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 对于重载的方法，访问权限修饰符，父类 >= 子类
    @Override
    public void action() {
        super.action();
        System.out.println("小狗汪汪叫....");
    }
}
