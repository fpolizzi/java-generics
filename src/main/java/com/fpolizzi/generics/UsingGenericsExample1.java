package com.fpolizzi.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 10.02.26
 */
public class UsingGenericsExample1 {

    static void main() {

        // define an ArrayList that
        // accepts only Integers
        List<Integer> numbers = new ArrayList<>();

        // add Integer 1
        numbers.add(1);

        // add String "2" is not allowed anymore,
        // so we'll add Integer 2 instead
        numbers.add(2);

        for(Object number : numbers) {

            // print the number
            System.out.println(number);

            // print the type of the number
            System.out.println(number.getClass());
        }
    }
}
