package com.oyelowo.collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClassDemo {
    public static void main(String[] args) {
        // You can also specify specific types
        List<Number> values2 = new ArrayList<>();
        values2.add(4);
        values2.add(26);
        values2.add(78);
        values2.add(1,3);
        values2.add(Float.parseFloat("465.657e34f"));

        // Collections.sort(values2);
        for (Number eachNumber:
                values2 ) {
            System.out.println(eachNumber);
        }

    }
}
