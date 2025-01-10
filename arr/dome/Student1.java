package com.arr.dome;

public class Student1 implements Comparable{
    String name;
    int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student1 stu = (Student1)o;
        return  stu.age -this.age;
    }
}
