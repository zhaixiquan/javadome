package com.tjtc.day03;

import java.util.Arrays;
import java.util.Comparator;

public class Dome6 {
    public static void main(String[] args) {
        // 数组排序
        Integer[] arr = {5,5,4,7,4};



        // 数组的排序 快速排序、冒泡排序
        /*
        * 5,1,2,7,4   || 1 5 2 7 4 || 1 2 5 7 4 ||  1 2 5 4 7
        * */
        // 如果条件成立，交换数据  冒泡排序法
       /* for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }*/
        // jdk 中给我们提供了的排序方法
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


    }
}
