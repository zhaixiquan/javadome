package com.arr.dome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Iterator<String> iterator = list.iterator();
        // 通过迭代器获取集合元素
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(iterator.next());
        }

    }
}
