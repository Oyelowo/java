package com.oyelowo.collectionsAndGenerics;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stud implements Comparable<Stud>{
    String name;
    int rollNo,marks;


    public Stud(String name, int rollNo, int marks) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    // This is compulsory for comparable unlike the comparator for integer, where you can directly use an anonymous method
    public int compareTo(Stud s){
        return this.name.length() > s.name.length() ? 1 : -1;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {


        // SORTING BASED ON THE LAST NUMBER OF EACH VALUE
        // You can also specify specific types
        List<Stud> students = new ArrayList<>();
        students.add(new Stud("Oyelowo", 24, 100 ));
        students.add(new Stud("Dayo", 66, 20 ));
        students.add(new Stud("Maria", 44, 74 ));
        students.add(new Stud("Petri", 19, 52 ));

        // For this to work, I had to implement the Comparable interface with compareTo method
        Collections.sort(students);

        // You can also use an anonymous function for the sorting but you still have to have the compareTo method in the class which implements the Comparable interface
        Collections.sort(students, (i, j)-> i.marks > j.marks ? 1: -1);

        for (Stud eachStudent: students
             ) {
            System.out.println(eachStudent);
        }


    }
}

