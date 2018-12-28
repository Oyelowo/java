package com.oyelowo.collectionsAndGenerics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map myMap = new HashMap();
        myMap.put("myName", "Oyelowo");
        myMap.put("Friend", "me");
        myMap.put("age", 24);
        myMap.put("Friend", "Mika"); // This will replace the above value with same key "Friend" because the keys also use set

        System.out.println(myMap);

        // HASHMAP: THIS IS NOT SYNCHRONIZED I.E NOT THREAD-SAFE (This is mostly used.)
        // HasMap does not also give the values in the right sequence
        Map<String, Object> myMapTypeSafe = new HashMap<>();
        myMapTypeSafe.put("myName", "Oyelowo");
        myMapTypeSafe.put("Friend", "me");
        myMapTypeSafe.put("age", 24);
        myMapTypeSafe.put("Friend", "Mika");

        System.out.println(myMapTypeSafe.get("myName"));

        System.out.println(myMapTypeSafe.get("myName11")); // Gives null (rather than raise Exception) for unavailable values.

        Set<String> keys = myMapTypeSafe.keySet();

        for (String key: keys
             ) {
            System.out.println("Key: " + key + "\t| Value: " + myMapTypeSafe.get(key));
        }


        // HASHTABLE:  THIS IS SYNCHRONIZED I.E THREAD-SAFE
        // HasMap does not also give the values in the right sequence
        Map<String, Object> myMapTypeSafe2 = new Hashtable<>();
        myMapTypeSafe2.put("myName", "Oyelowo");
        myMapTypeSafe2.put("Friend", "me");
        myMapTypeSafe2.put("age", 24);
        myMapTypeSafe2.put("Friend", "Mika");

        System.out.println(myMapTypeSafe2.get("myName"));

        System.out.println(myMapTypeSafe2.get("myName11")); // Gives null (rather than raise Exception) for unavailable values.

        Set<String> keys2 = myMapTypeSafe2.keySet();

        for (String key: keys2
        ) {
            System.out.println("Key: " + key + "\t| Value: " + myMapTypeSafe2.get(key));
        }


    }
}
