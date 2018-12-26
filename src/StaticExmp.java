
class Emp {
    int id;
    int salary;
    static String ceo;
    static{
        ceo = "Mika";
        System.out.println("static");
    }

    public Emp() {
        System.out.println("Constructor");
    }

    public void show() {
        System.out.println(id +   "      " +  salary + "    " + ceo);
    }

}



public class StaticExmp {

    public static void main(String[] args) {
        Emp oyelowo = new Emp();

        oyelowo.id = 99;
        oyelowo.salary = 434343;

        Emp dayo = new Emp();
        dayo.id = 34;
        dayo.salary = 54667;
        //dayo.ceo = "Petri";


        oyelowo.show();
        dayo.show();
    }

    
}