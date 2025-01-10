package com.tjtc.day02;

import java.util.Scanner;

public class Dome5 {
    // switch  1.7 大多数情况是用int   1.8 String 枚举
    public static void main(String[] args) {
        // 如果我输入的是1为星期一，2为星期二，... 7为星期日 1-7
        // switch 必须遇到break 结束执行，负责就会一直执行下去
        // 快速补全变量的方法 1.  .var  2.alt+回车7

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1-7的数字:");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("请输入正确的星期");
                break;
        }
    }
}
