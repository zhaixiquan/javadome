package com.arr.dome;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("D:"+File.separator+"b");
//        if (file.exists()) {
//            System.out.println(file.delete());
//        }
        deleteFile(file);
    }


    private static  void deleteFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
            }else {
                deleteFile(file1);
            }
        }
        file.delete();
        System.out.println(file);
    }
}
