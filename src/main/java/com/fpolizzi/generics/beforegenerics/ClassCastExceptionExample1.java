package com.fpolizzi.generics.beforegenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 10.02.26
 */
public class ClassCastExceptionExample1 {

    static void main() {

        // define an ArrayList without a specific
        // type (so type Object will be used)
        List numbers = new ArrayList();

        // add the primitive int 1
        numbers.add(1);

        // add the String "2"
        numbers.add("2");

        // explicit cast to Object is necessary
        // to run this loop
        for(Object number : numbers) {

            // print the number
            System.out.println(number);

            // print the type of the number
            System.out.println(number.getClass());

            // the following both lines would
            // throw a ClassCastException
            // System.out.println(((Integer) number));
            // System.out.println(((String) number));
        }
    }
}
