package com.fpolizzi.generics;

/**
 * Created by fpolizzi on 14.02.26
 */
public class GenericAndMethods {

    static void main() {

        String[] names = {"John", "Mary", "Peter"};
        Character[] chars = {'a', '2', 'c'};
        Integer[] numbers = {1, 2, 3};

        print(names);
        print(chars);
        print(numbers);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(
                    e.getClass().getName() +
                            " - " + e
            );
        }
    }
}
