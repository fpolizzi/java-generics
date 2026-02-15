package com.fpolizzi.generics;

/**
 * Created by fpolizzi on 14.02.26
 */
public class GenericAndMethods {

    static void main() {

        // define difference types of arrays
        String[] names = {"John", "Mary", "Peter"};
        Character[] chars = {'a', '2', 'c'};
        Integer[] numbers = {1, 2, 3};

        // invoke the print method with different types
        print(names);
        print(chars);
        print(numbers);
    }

    // use a generic method to perform the same action
    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(
                    e.getClass().getName() +
                            " - " + e
            );
        }
    }
}
