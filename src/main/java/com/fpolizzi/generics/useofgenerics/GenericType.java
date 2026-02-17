package com.fpolizzi.generics.useofgenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fpolizzi on 14.02.26
 */
public class GenericType {

    static void main() {

        // List<E> (<E> = type parameter) is a generic with the type argument String
        // only Strings could be in the list
        List<String> names =
                new ArrayList<>();

        // List<E> (<E> = type parameter) is a generic with the type argument Integer
        // only Integers could be in the list
        List<Integer> numbers =
                new ArrayList<>();

        // Map<K, V> (<K> = key <V> = value type parameter) is a generic
        // with the type arguments String and String
        Map<String, String> map =
                new HashMap<>();

        // Map<K, V> (<K> = key <V> = value type parameter) is a generic
        // with the type arguments Integer and Double
        Map<Integer, Double> map1 =
                new HashMap<>();
    }
}
