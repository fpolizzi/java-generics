package com.fpolizzi.generics.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Created by fpolizzi on 16.02.26
 */
public class UpperBoundedWildcards {

    static void main() {

        // Upper Bounded Wildcards
        List<Double> list1 = Arrays.asList(0.6, 1.5, 0.9);
        List<Integer> list2 = Arrays.asList(0, 1, 2);
        List<Number> list3 = Arrays.asList(100, 4.7, -0.45);

        print(list1);
        print(list2);
        print(list3);
    }

    // everything that extends Number is allowed -> upper bound wildcard
    static void print(List<? extends Number> list) {

        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
