package com.oyelowo.collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List is an interface which extends collection. So,it has all the features of Collection also
public class ListInterface {
    public static void main(String[] args) {
        // ArrayList is a class which extends a list(AbstractList) and List extends a Collection.
        // Therefore, it is an indirect implementation of collection.
        // List can work with index number, so elements can be added in-between
        // By default, this is a list of object
        List values = new ArrayList();

        // You can also specify specific types
        List<Number> values2 = new ArrayList<>();
        values2.add(4);
        values2.add(26);
        values2.add(78);
        values2.add(1,3);
        values2.add(Float.parseFloat("465.657e34f"));

        values.add(4); // This is an object of integer(i.e Integer v = new Integer(4)) and not just primitive(int 4), because the default value of the List is Object, when we don't specify
        values.add(26);
        values.add(78);
        values.add(1,3);
        values.add("Oyelowo");

        System.out.println(values);

        // USING ITERATOR ON A LIST ALSO
        // Iterators can also be used with List e.g:
        Iterator myIteratedList = values.iterator();
        while (myIteratedList.hasNext()){
            System.out.println(myIteratedList.next());
        }

        System.out.println();

        // FOR LOOP
        // However, for loop can work here, since list supports indexing

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        
        System.out.println();

        for (Object eachNumber:
             values) {
            System.out.println(eachNumber);
        }

        System.out.println();

        for (Number eachNumber:
             values2) {
            System.out.println(eachNumber);
        }



    }
}
