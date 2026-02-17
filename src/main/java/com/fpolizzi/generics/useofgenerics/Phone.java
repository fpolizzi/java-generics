package com.fpolizzi.generics.useofgenerics;

/**
 * Created by fpolizzi on 14.02.26
 */
public class Phone {

    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String get() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
