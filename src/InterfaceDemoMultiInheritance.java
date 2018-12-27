// Abstract class -> here, you can declare and define methid
// Interface -> Up till 1.7, you can only declare but not define. Now from java 1.8 , you can both declare and define methods in interface by using the default keyword.
// Now, there is not much difference between interface and abstract class, but interfaces are mostly preferable.


// This is also a functional interface as it has only one abstract method
@FunctionalInterface
interface InterfaceDemoNew2 {
    // this is an abstract method by default
    void abc();
    default void show() {
        System.out.println("in  InterfaceDemoNew2 Show");
    } 
};

interface MyDemo {
    default void show() {
        System.out.println("in MyDemo Show");
    } 
};

// anther way to solve clash between same method from two different interfaces.
class DemoImp2 implements InterfaceDemoNew2, MyDemo {
    public void abc() {
        System.out.println("In abc");
    };

    @Override
    public void show() {
        InterfaceDemoNew2.super.show();
        MyDemo.super.show();
    }

}

// one way to sold method classes from two different interfaces with same method name is to create a new method with the same name in the class
// which will override the method from the two interfaces as below:
/* class DemoImp2 implements InterfaceDemoNew2, MyDemo {
    public void abc() {
        System.out.println("In abc");
    };

    public void show() {
        System.out.println("In DemoImp2 show");
    }

} */

public class InterfaceDemoMultiInheritance {

    public static void main(String[] args) {
        DemoImp2 obj = new DemoImp2();
        obj.abc();
        obj.show();
    }
}