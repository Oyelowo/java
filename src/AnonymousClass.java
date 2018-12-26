// Use anonymous method if the only reason to create a new class(for one time use) would be to override a mthod.

class AAA {
    public void show() {
        System.out.println("In AAA show");
    }

}

// The below is not necessary
/*
 * class BBB extends AAA { public void show() {
 * System.out.println("Im the best"); }
 * 
 * }
 */

public class AnonymousClass {
    public static void main(String[] args) {

        // This is how to create an anonymous class. This cannot be reused.(one time)
        AAA obj = new AAA() {
                                public void show() {
                                    System.out.println("Im the best");
                                }
                         };

        // Calling show of the anoymous class
        obj.show();

    }

}