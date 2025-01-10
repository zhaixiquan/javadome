package com.tjtc.day18;

public class Test {
    public static void main(String[] args) {
        String str = "abacdef";
        // 字符串替换方法
        String replace = str.replace("a", "x");
        System.out.println(str);
        System.out.println(replace);
        String[] as = str.split("a");
        for (String a : as) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(str.substring(1,6));
    }
}
