package com.tjtc.day18;

import java.math.BigDecimal;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        System.currentTimeMillis();
        // 生成 [0,1)  10 - 16 [a,b]  Math.random()*(b-a+1) +a
       /* for (int i = 0; i < 100; i++) {
            int j = (int) (Math.random() * 7) + 10;
            // 生成区间 =
            System.out.println(j);
        }*/
        Random random = new Random();

        int i = random.nextInt(100);
        System.out.println(i);

    }
}
