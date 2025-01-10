package com.tjtc.day03;

/*
*
* 无返回值无参数
* 无返回值有参数
* 有返回值无参数
* 有返回值有参数
*
* 修饰符 返回值类型  方法名(形参列表) {
*
* // 要执行的方法体
*
* }
*
* */
public class Dome1 {

    // 主函数，压栈、入栈函数
    public static void main(String[] args) {
        methods(); // 抽离方法，提高代码的复用性
        int result = result();
        System.out.println(result);

        // 在方法调用的时候，这个参数叫实际参数
        getName("李四");

        // 调用add方法
        int add = add(1, 3);
        System.out.println(add);

    }

    public static void methods() {
        System.out.println("这是一个无返回值无参数的方法");
    }

    // 有返回值无参数的方法
    public static int result(){
        return  1;
    }

    // 无返回值，有参数 在方法定义的时候，参数为形式参数
    public static void getName(String name){
        System.out.println("我的名字叫:"+name);
    }

    // 有返回值有参数的方法
    public static int add(int a ,int b) {
        return  a + b;
    }
}
