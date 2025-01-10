package com.tjtc.day06;


import com.tjtc.day07.Dome1;

public class Test extends Dome1 {
    public static void main(String[] args) {
        Student stu = new Student();
        // 给对象的成员属性赋值，通过对象.成员属性 = "值"
        stu.name = "张三";
        stu.age = 18;
        // 调用对象的方法，使用对名称. 方法名
        stu.read();
        //System.out.println(stu.name);

        Dome1 dome1 = new Dome1();
        System.out.println(dome1.name);

    }
    public void  show () {
        Dome1 dome1 = new Dome1();
        System.out.println(dome1.name);
        //System.out.println(dome1.height);
       // System.out.println(dome1.age);
        //System.out.println(dome1.sex);
    }
}
