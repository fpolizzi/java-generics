package com.fpolizzi.generics;

/**
 * Created by fpolizzi on 15.02.26
 */
public class MultipleBounds {

    static void main() {

        Integer[] numbers = {1, 2, 3};

        System.out.println(countGreaterThan(numbers, 1));

        Double[] numbers2 = {1.0, 2.0, 3.0};

        System.out.println(countGreaterThan(numbers2, 1.0));
    }

    interface A {}
    interface B {}

    // first implement an existing class, then the interfaces
    // extends Comparable<T> and extends interfaces A and B
    // static <T extends Comparable<T> & A & B> int countGreaterThan(T[] numbers, T number) {

    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {

        int count = 0;

        for (T n : numbers) {

            if (n.compareTo(number) > 0) {
                count++;
            }
        }

        return count;
    }
}
