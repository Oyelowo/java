import java.util.ArrayList;


class Student {
    int matricNo;
    String name;
    
}

public class ArrayDemo {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        Student s[] =  {s1, s2, s3, s4};

     for (Student each : s) {
        System.out.println(each);
     }
        
    }
}