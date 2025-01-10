package com.arr.dome;

public class Goods<T> {

    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Goods(T info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "info=" + info +
                '}';
    }
}
