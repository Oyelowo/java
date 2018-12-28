package com.oyelowo.collectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericWithList<T> {
    List<T> values = new ArrayList<>();

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
    }

    public static void main(String[] args) {
        GenericWithList myNumber = new GenericWithList();
        List<Number> numbersInt = new ArrayList<>();
        numbersInt.add(4f);
        numbersInt.add(36f);
        numbersInt.add(Integer.parseInt("89"));

        myNumber.setValues(numbersInt);
        System.out.println(myNumber.getValues());
    }
}
