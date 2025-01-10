package com.arr.dome;

public class InnerStuentImpl<T> implements Inner<T> {


    public static void main(String[] args) {
        Inner<Student1> inner = new InnerStuentImpl();
        inner.show(new Student1("张三",19));

        Inner<String> inner1 = new InnerStuentImpl();
        inner1.show("ssss");
    }

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
