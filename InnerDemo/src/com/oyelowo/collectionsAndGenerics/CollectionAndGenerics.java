package com.oyelowo.collectionsAndGenerics;

import java.util.*;

// Collection exist as : Collection as an interface, Collection as a class and collections as a concept

public class CollectionAndGenerics {
    public static void main(String[] args) {
        // Collection is an interface. Set and List are also interfaces.
        // ArrayList is a class(that is why we can create a new object with it using new ArrayList<>() keyword
        //ArrayList extends a List which implements Collection interfaces.
        // Set and Map are also interfaces. HashSet and TreeSet are both classes.

        // If you don't specify any type, then the elements can be of any type.
        Collection unDefinedValuesAcceptsAnytype = new ArrayList();

        // Before 1.7 version, You needed to specify the types of elements on the left and right side of the equation as below:
        Collection<Integer> values0 = new ArrayList<Integer>();
        //From 1.7 and above, you don't have to specify the data type on the right hand size. Just use the arrows as below:

        //Collection<Number> values = new ArrayList<>();

        // collection does not work with index number, thus, values cannot be added in between
        Collection<Number> values1 = new ArrayList<>();

        // List allows duplicate elements. Order is fixed when traversing.
        List<Number> values = new ArrayList<>();

        // Set allows only unique values. Order is random when traversing.
        Set<String> values2 = new HashSet<>();

        // This gives out elements in sorted manner. e.g 4,7,3,6,1 will yield 1,3,4,6,7
        Set<Number> values3 = new TreeSet<>();

        values.add(2f);
        values.add(Float.parseFloat("545.8f"));
        values.add(5);
        System.out.println(values);


        // MAP <Key Value>
        Map <String, Integer> hasMaphValues = new HashMap<>();  // This is synchronized (Thread safe)
        Map <String, Integer> hashTableValues = new Hashtable<>();  // -This is unsynchronized (Non thread safe)

    }
}
