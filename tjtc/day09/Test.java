package com.tjtc.day09;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三");
        //student.setName("张三");
        student.setAge(20);
        student.rade();

        Student student1 = new Student("李四",19);
        student1.rade();
    }
}
