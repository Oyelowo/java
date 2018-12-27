class Outer {
    private String goodie;
    static int a;


    public Outer(String goodie) {
        this.goodie = goodie;
    }

    private void removeWhiteSpace() {
        this.goodie = this.goodie.replaceAll("\\s+","");
    }

    public static void checkLonger(Outer outer1, Outer outer2) {
        outer1.removeWhiteSpace();
        outer2.removeWhiteSpace();
        boolean firstToSecond = outer1.goodie.length() > outer2.goodie.length();
        if (firstToSecond) {
            System.out.println(outer1.goodie + " is longer than " + outer2.goodie);
        } else {
            System.out.println(outer1.goodie + " is NOT longer than " + outer2.goodie);
        }
    }

    static class Inner{     //Outer$Inner.class
        public void display() {
        System.out.println("inner display");
     }
        
    }
}



public class innerClassDemo {

    public static void main(String[] args) {
        Outer obj2 = new Outer("Oyelowo");
        Outer obj3 = new Outer("Dayo         ");
        Outer.checkLonger(obj2, obj3);
        
        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();
    }
}