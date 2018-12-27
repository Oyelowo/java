// Types of interface

// 1. Normal interface: has more than one method.

// 2. Single abstract method/FUNCTIONAL(IN JAVA 8) interface: has one method. in java 8, this is called A FUNCTIONAL INTERFACE.
// WTH FI, you can use functional interfaces which was adopted Scala.

// 3. Marker interface: Does not have any method. e.g Serializable


// using interface to achieve the concept of generalization

@FunctionalInterface
interface Abc2 {
    void show();
}

/* class Implimentor2 implements Abc2 {
    public void show() {
        System.out.print("implemnted func");
    }
    
} */

public class InterfaceFunctionalLamda {

    public static void main(String[] args) {
        Abc2 obj = () -> System.out.print("lambda expression is possible only with functional interface because it has only one method. Func Int only works in java 8 upwards")
        obj.show();
    }
}
