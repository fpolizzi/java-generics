package com.fpolizzi;

/**
 * Created by fpolizzi on 13.02.26
 */
public class ClassCastExceptionExample2 {

    static void main() {

        // define a number variable
        // Comparable number = 10;

        // try to compare number with string
        // number.compareTo("10");
        // -> ClassCastException occurs

        Comparable<Integer> number = 10; // avoid ClassCastException with generics
        System.out.println(number.compareTo(10));
    }
}
