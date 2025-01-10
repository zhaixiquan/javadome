package com.arr.dome;

public class Test3 {


    public static void main(String[] args) {
        // 使用方式一调用静态的泛型方法
        Student.staticMethod("staticMethod");
        // 使用方式二调用静态的泛型方法
        Student.<String>staticMethod("staticMethod");
        Student stu = new Student();
        // 使用方式一调用普通的泛型方法
        stu.otherMethod(666);
        // 使用方式二调用普通的泛型方法
        stu.<Integer>otherMethod(666);

    }


    /*E arr(int index){
        return (E) arr[index];
    }*/
}
