package com.tjtc.day02;

import java.util.Scanner;

public class Dome2 {

    public static void main(String[] args) {
        // 如果成绩大于90 及为优秀  90-80 为良好 80 -60 为及格  60-0 一下为不及格  10000 -23232
        Scanner scanner = new Scanner(System.in); // 获取键盘录入的一个输入流
        System.out.println("请输入同学的成绩,为一个整数:");
        int score = scanner.nextInt(); // 将输入的成绩赋值给score
        if (score <= 100 && score >= 90) {
            System.out.println("这位同学的成绩为优秀");
        }else if (score < 90 && score >= 80) {
            System.out.println("这位同学的成绩为良好");
        }else if (score < 80 && score >= 60) {
            System.out.println("这位同学的成绩及格了");
        }else if (score < 60 && score >= 0) {
            System.out.println("这位同学的成绩不及格");
        }else {
            System.out.println("请输入正确的成绩");
        }
    }
}
