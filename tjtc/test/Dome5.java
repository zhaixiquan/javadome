package com.tjtc.test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Dome5 {
    public static void main(String[] args) {
        long i = 1111111222222222L;
        // 正常情况下，在java计算中，不能使用java的一些基本数据类型的。
        double a = 1.1;
        double b = 1.223;
        System.out.println(a+b); // 2.3230000000000004
        // 出现了精度问题 BigDecimal BigInteger
        // A = 65 a= 97 b c
        char ar = 'B';
        System.out.println((int)ar);
        // 布尔变量  true false
    }
}
