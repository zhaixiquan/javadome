package com.arr.dome;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\test1.txt");
        System.out.println(fileReader.read());
        System.out.println(fileReader.read());
        System.out.println(fileReader.read());
        System.out.println(fileReader.read());
        System.out.println(fileReader.read());
        int len;
        if ((len = fileReader.read()) != -1) {
            System.out.println(fileReader.read());
        }
    }
}
