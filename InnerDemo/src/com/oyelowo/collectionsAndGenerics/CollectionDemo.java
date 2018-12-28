package com.oyelowo.collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection does not support index numbers. Thus, we cannot fetch numbers with their indexes
        Collection values = new ArrayList();
        values.add(55);
        values.add(554);
        values.add(93);

        // e.g The below wont work
        // System.out.println(values[0]);

        // There, we have to use the Iterator interface and iterator method to iterate over the collection
        Iterator iterataleValues = values.iterator();

       /* System.out.println(iterataleValues.next());
        System.out.println(iterataleValues.next());
        System.out.println(iterataleValues.next());*/

        //System.out.println(iterataleValues.next()); // This raises an error becuase it already exhausted the collection ArrayList

        // Therefore, it is better to check e.g with a while loop.

        while (iterataleValues.hasNext()){
            System.out.println(iterataleValues.next());
        }
    }
}
