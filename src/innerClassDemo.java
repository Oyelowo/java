class Outer {

    static int a;
    public static void show() {
        
    }

    static class Inner{     //Outer$Inner.class
        public void display() {
        System.out.println("inner display");
     }
        
    }
}



public class innerClassDemo {

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        
        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();
    }
}