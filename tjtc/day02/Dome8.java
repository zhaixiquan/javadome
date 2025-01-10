package com.tjtc.day02;

public class Dome8 {
    public static void main(String[] args) {
       /* for 循环的永真循环
        for (;;) {

        }*/
        //  while:不知道具体使用的次数 for：明确知道了要循环的次数
        //  switch：明确了有几个值的时候 if；对于成绩这种，不能枚举出来，或者枚举出来有太多种情况
        for (int i = 0;i < 3 ; i++) {
            // 执行里面的语句
            System.out.println(i);
        }
    }
}
