package com.io.dome;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        System.out.println(file);

        File file1 = new File("D:");
        //System.out.println(file1);

        File file2 = new File(file1,"test.txt");
        System.out.println(file2.exists()+"=====================");


        File file3 = new File("dome01\\src\\hellow.txt");
        System.out.println(file3);
        System.out.println(file3.exists());
        System.out.println("======================");

        System.out.println(file3.exists());
        System.out.println(file3.getPath());
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.length());
        System.out.println(file3.delete());
        System.out.println(file3.mkdirs());


    }
}
