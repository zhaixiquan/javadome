package com.tjtc.day08;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(11);
        student.study();

        Student student1 = new Student("李四",18);
        student1.study();
    }
}
