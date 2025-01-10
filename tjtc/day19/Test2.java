package com.tjtc.day19;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        int a = 17;
        List<Integer> list = new ArrayList<>();

        out:while (true){
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    list.add(i);
                    if (a == i ||  a/i ==1) {
                        break out;
                    }
                    a = a/i;
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
