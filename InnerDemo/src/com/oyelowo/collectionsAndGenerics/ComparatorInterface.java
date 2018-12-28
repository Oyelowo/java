package com.oyelowo.collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// we have to create our own class which implements Comparator Interface because there is not class by default which does that
// and recall that we can only reference interface, we cannot use it to create an object (e.g new Interface())
// To solve this, we have to create our own class or use an anonymous class

public class ComparatorInterface {
    public static void main(String[] args) {


        // SORTING BASED ON THE LAST NUMBER OF EACH VALUE
        // You can also specify specific types
        List<Integer> values3 = new ArrayList<>();
        values3.add(786);
        values3.add(434);
        values3.add(265);
        values3.add(1,364);


       Comparator<Integer> myComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                int valueInIndex2ForI = i%10;
                int valueInIndex2ForJ = j%10;
                // use ternary expression
                return valueInIndex2ForI > valueInIndex2ForJ ? 1 : -1;
                // or use the classic if else statement
                /*if (i%10 > j%10){
                    return 1;
                } else{
                    return -1;
                }*/
            };
        };


        Comparator<Integer> myComp2 = (Integer i, Integer j)-> {
                int valueInIndex2ForI = i%10;
                int valueInIndex2ForJ = j%10;
                return valueInIndex2ForI > valueInIndex2ForJ ? 1 : -1;
            };

        Comparator<Integer> myComp3 = (i, j)-> i%10 > j%10 ? 1 : -1;

        // You can make the above even slimmer because it is a functional interface which has just one abstract method:


        // OVERWRITING THE LOGIC IN SORT METHOD can be done in any of the below wys:
        Collections.sort(values3, myComp);
        Collections.sort(values3, myComp2);
        Collections.sort(values3, myComp3);
        Collections.sort(values3, (i, j)-> i%10 > j%10 ? 1 : -1);
        for (Integer eachNumber: values3
             ) {
            System.out.println(eachNumber + " :Last Number: " + eachNumber%10);
        }
    }
}
