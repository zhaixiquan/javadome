package com.io.dome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //File file = new File("src\\hellow.txt");
        File file = new File("src\\hellow.txt");
        System.out.println(file);
        System.out.println(file.exists());
//        FileInputStream fileInputStream = new FileInputStream("src\\hellow.txt");
//        System.out.println(fileInputStream.read());
//        fileInputStream.close();
    }
}
