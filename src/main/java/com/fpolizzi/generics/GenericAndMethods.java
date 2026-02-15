package com.fpolizzi.generics;

/**
 * Created by fpolizzi on 14.02.26
 */
public class GenericAndMethods {

    static void main() {

<<<<<<< HEAD
=======
        // define difference types of arrays
>>>>>>> 6d57d78 (feat: add comments to clarify)
        String[] names = {"John", "Mary", "Peter"};
        Character[] chars = {'a', '2', 'c'};
        Integer[] numbers = {1, 2, 3};

<<<<<<< HEAD
=======
        // invoke the print method with different types
>>>>>>> 6d57d78 (feat: add comments to clarify)
        print(names);
        print(chars);
        print(numbers);
    }

<<<<<<< HEAD
=======
    // use a generic method to perform the same action
>>>>>>> 6d57d78 (feat: add comments to clarify)
    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(
                    e.getClass().getName() +
                            " - " + e
            );
        }
    }
}
