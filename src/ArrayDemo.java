import java.util.ArrayList;


class Student {
    int matricNo;
    String name;


    public Student() {
    }

    public Student(int matricNo, String name) {
        this.matricNo = matricNo;
        this.name = name;
    }

    public int getMatricNo() {
        return this.matricNo;
    }

    public void setMatricNo(int matricNo) {
        this.matricNo = matricNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "{" +
            " matricNo='" + getMatricNo() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
    
}

public class ArrayDemo {




    public static void main(String[] args) {
        Student s1 = new Student(1245, "Oyelowo");
        Student s2 = new Student(5455, "Dayo");
        Student s3 = new Student(542566, "Frank");
        Student s4 = new Student(696973, "Mika");

        Student s[] =  {s1, s2, s3, s4};

     for (Student each : s) {
        System.out.println(each.matricNo + " : " + each.name);
     }
        
    }
}