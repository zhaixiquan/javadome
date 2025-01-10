package com.tjtc.day07;

public class Dome1 {

   // private (私有的)、 default（默认的）、protected （受保护的）、public（公开的）



    public String name = "张三";

    int height = 176;

    protected int age = 18;

    private String sex = "男";


    public static void main(String[] args) {
        Dome1 dome1 = new Dome1();
        System.out.println(dome1.name);
        System.out.println(dome1.height);
        System.out.println(dome1.age);
        System.out.println(dome1.sex);

    }


}
