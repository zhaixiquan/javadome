package com.arr.dome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
   /*     FileInputStream fis = new FileInputStream("D:\\test.txt");
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
        int len;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }*/
        FileOutputStream fos = new FileOutputStream("D:\\test1.txt",true);
        fos.write("\n\t".getBytes());
        fos.write("赵六".getBytes());
    }
}
