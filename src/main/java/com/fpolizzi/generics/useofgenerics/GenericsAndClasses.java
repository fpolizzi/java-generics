package com.fpolizzi.generics.useofgenerics;

/**
 * Created by fpolizzi on 14.02.26
 */
public class GenericsAndClasses {

    static void main() {

        // define a box that accepts a phone
        Box<Phone> box = new Box<>();

        box.set(new Phone("Samsung"));

        System.out.println(box.get());

        // define a box that accepts a letter
        Box<Letter> box2 = new Box<>();

        box2.set(new Letter("Archimedes"));

        System.out.println(box2.get());
    }
}