package com.arr.dome;

public class Test2 {
    public static void main(String[] args) {
        Goods<Integer> goods = new Goods<>(1234);
        System.out.println(goods);

        Goods<String> goods1 = new Goods<>("12323");
        System.out.println(goods1);

        Goods<Student1> goods2 = new Goods<>(new Student1("张三",12));
        System.out.println(goods2);
    }
}
