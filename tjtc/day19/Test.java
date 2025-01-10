package com.tjtc.day19;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        test(new Son());

        test(new Father() {
            @Override
            public void show() {
                System.out.println("张三");
            }
        });

        Integer[] arr = {11,10,23,2};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void test(Father futher){
        futher.show();
    }


}
