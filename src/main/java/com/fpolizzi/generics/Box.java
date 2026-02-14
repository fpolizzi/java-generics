package com.fpolizzi.generics;

/**
 * Created by fpolizzi on 14.02.26
 */
public class Box<T> {

    private T type;

    public T get() {
        return type;
    }

    public void set(T type) {
        this.type = type;
    }
}