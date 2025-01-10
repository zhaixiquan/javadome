package com.arr.dome;

public class InnerImpl implements Inner<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
