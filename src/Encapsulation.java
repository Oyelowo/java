//  Encapsulation: Binding data with methods
class StudentFin {

    private int idNo;
    private String name;

    // Getters and Setters

    public int getIdNo() {
        System.out.println("You are accessung the Id Number");
        return this.idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
        System.out.println("IdNo changed");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}



public class Encapsulation {

    public static void main(String[] args) {
        StudentFin s1 = new StudentFin();
        s1.setIdNo(43);
        s1.setName("Oyelowo");
        System.out.println(s1.getIdNo());   
    }
}