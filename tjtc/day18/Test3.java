package com.tjtc.day18;

import java.math.BigDecimal;

public class Test3 {
    public static void main(String[] args) {
//        BigDecimal bigDecimal = new BigDecimal("5");
//        BigDecimal bigDecimal1 = new BigDecimal("4");
//        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_FLOOR));
//        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));

        BigDecimal bigDecimal = new BigDecimal("123.345");
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_FLOOR));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_UP));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_CEILING));
        System.out.println(bigDecimal.setScale(1, BigDecimal.ROUND_HALF_UP));
        System.out.println(bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP));


    }
}
