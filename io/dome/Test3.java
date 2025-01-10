package com.io.dome;

import java.io.File;
import java.io.FilenameFilter;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("D:\\work\\workspace\\dome01\\src\\com\\arr\\dome");
        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
                if (currFile.isFile() && name.endsWith(".txt")) return  true;
                return false;
            }
        };
        String[] list = file.list(filenameFilter);
        for (String s : list) {
            System.out.println(s);
        }


    }
}
