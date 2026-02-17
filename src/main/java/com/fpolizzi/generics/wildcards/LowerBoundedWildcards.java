package com.fpolizzi.generics.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Created by fpolizzi on 16.02.26
 */
public class LowerBoundedWildcards {

    static void main() {

        // Lower Bounded Wildcards
        List<Number> list1 = Arrays.asList(0.3, 1.5, 0.8);
        List<Integer> list2 = Arrays.asList(0, 1, 2);
        List<Number> list3 = Arrays.asList(0, 1, 2);

        print(list1);
        print(list2);
        print(list3);
    }

    // every super class from Integer(included) is allowed -> lower bound wildcard
    static void print(List<? super Integer> list) {

        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
