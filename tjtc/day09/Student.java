package com.tjtc.day09;

/**
 * 对于java中的一个类，默认是有一个无参构造的
 * 如果从新定义了一个新的构造方法，默认方法失效
 */
public class Student {

    private String name;

    private int age;

    // 方法名相同，参数列表不同（个数、顺序、类型） 与返回值无关
    public Student () {
        //this("张三");
        System.out.println("调用了无参构造");
    }

    // 在构造方法中调用构造方法，必须写在方法的第一行
    // 构造方法相互之间不能，出现相互调用的情况
    public Student(String str) {
        this();
        name = str;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int number) {
        if (number < 0 || number > 200) {
            System.out.println("年龄输入非法");
            return;
        }
        age = number;
    }



    public int getAge(){
        return age;
    }

    public  void rade(){
        System.out.println(name+"正在学习，今年"+age+"岁");
    }
}
