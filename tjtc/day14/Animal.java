package com.tjtc.day14;

public interface Animal {
    public static final String NAME = "动物";

    public static final String ID = "123456";

    public abstract void shout();

    public abstract void info();

    public static String getID(){
        return ID;
    }
}
