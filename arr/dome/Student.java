package com.arr.dome;

public class Student {
    // 静态泛型方法
    public static <T> void staticMethod(T t) {
        System.out.println(t + "..." + t.getClass());
    }
    // 普通泛型方法
    public <T> void otherMethod(T t) {
        System.out.println(t + "..." + t.getClass());
    }

}
