package com.arr.dome;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        System.out.println(file.length());
        System.out.println(file);
        getFile(file);
    }

    public static void getFile(File path){
        File[] files = path.listFiles();
        for (File file : files) {
            if (!file.isFile()) {
                getFile(file);
            }else {
                System.out.println(file);
            }
        }
//        String[] list = path.list();
//        for (String s : list) {
//            File file = new File(path,s);
//            if (!file.isFile()) {
//                getFile(file);
//
//            }else {
//                System.out.println(s);
//            }
//        }
    }
}
