package com.oyelowo.collectionsAndGenerics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>(); // Set is an interface, HashSet is a Class which implements the Set Interface
        // HashSet<Integer> values = new HashSet<>();
        values.add(3);
        values.add(65);
        values.add(8);
        values.add(3); // This won't add because set supports only unique element
        System.out.println(values + "\n");

        Set<Integer> values1 = new HashSet<>();
        System.out.println(values1.add(3));
        System.out.println(values1.add(887));
        System.out.println(values1.add(609));
        System.out.println(values1.add(3)); //This will return false because it cannot be added. There is already a 3
        System.out.println();

        // HashSet does not print the values in order which you have created them
        // because Hashing gets the nearest values in the heap memory first
        for (int i:values
             ) {
            System.out.println(i);
        }
        System.out.println();

        // Thus, if you want in ascending order, you can use a TreeSet
        Set<Integer> valuesTree = new TreeSet<>();
        valuesTree.add(334);
        valuesTree.add(85);
        valuesTree.add(6677);
        valuesTree.add(245);

        for (int i:valuesTree
        ) {
            System.out.println(i);
        }
    }
}
