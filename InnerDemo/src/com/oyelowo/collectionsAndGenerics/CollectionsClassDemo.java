package com.oyelowo.collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {
    public static void main(String[] args) {
        // You can also specify specific types
        List<Float> values2 = new ArrayList<>();
        values2.add(78.64f);
        values2.add(4.34f);
        values2.add(26.6542f);
        values2.add(1,3f);
        values2.add(Float.parseFloat("465.6E34f"));

        // Sort list
        Collections.sort(values2);

        System.out.println(values2);

        // Reverse to sort in descending order
        Collections.reverse(values2);
        System.out.println(values2);

        Float maxNum = Collections.max(values2);
        System.out.println(maxNum);

        // randomize the list
        Collections.shuffle(values2);

        System.out.println();
        for (Number eachNumber:
                values2 ) {
            System.out.println(eachNumber);
        }

    }
}
