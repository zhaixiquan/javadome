package com.tjtc.day17;

public class Inner {
    // 成员属性
    public String name = "inner";

    // 成员方法
    public void action(){
        System.out.println("外部类方法调用了");
    }
    // 测试调用内部类的方法

    public void test(){
        Outher outher = new Outher();
        outher.outer();
        System.out.println(outher.str);
    }

    // 成员内部类
    class Outher {
        public String str = "outher";
        public void outer(){
            System.out.println("获取内部类的name:"+name);
            action();
            System.out.println("内部类方法调用了");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.test();
        Outher outher = inner.new Outher();
        outher.outer();
//        Outher outher = new Outher();
//        Inner inner = new Inner();
//        Outher outher = inner.new Outher();
//        outher.outer();
//        System.out.println(outher.str);
    }
}
