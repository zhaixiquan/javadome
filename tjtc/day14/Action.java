package com.tjtc.day14;

public interface Action {

    default void eat(){
        System.out.println("吃骨头");
    }
}
