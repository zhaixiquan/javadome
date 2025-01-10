package com.tjtc.day03;

public class Dome7 {
    public static void main(String[] args) {
        // 要给arr数组中插入一个元素3
        int[] arr = {11,12,13,15,16}; //{1,2,3,4}
        // 首先的判断一下有要插入
        int index = -1;
        int temp =  14;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                index = i;
                break;
            }
        }
        // 数组是不是没有自动扩容的功能
        int[] arrNew = new int[arr.length+1];
        // 将老数组的数据放入到新数组中，包括咱们要插入的这个值
        for (int i = 0; i < arrNew.length; i++) {
             if (i < index) {
                 arrNew[i] = arr[i];
             }else if (i == index) {
                 arrNew[i] = temp;
             }else {
                 arrNew[i] = arr[i-1];
             }
        }
        // 输入扩容后的数组
        for (int i : arrNew) {
            System.out.print(i + " ");
        }


    }
}
