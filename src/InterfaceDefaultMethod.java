// Abstract class -> here, you can declare and define methid
// Interface -> Up till 1.7, you can only declare but not define. Now from java 1.8 , you can both declare and define methods in interface by using the default keyword.
// Now, there is not much difference between interface and abstract class, but interfaces are mostly preferable.


// This is also a functional interface as it has only one abstract method
@FunctionalInterface
interface InterfaceDemoNew {
    // this is an abstract method by default
    void abc();
    default void show() {
        System.out.println("in Show");
    } 
};

class DemoImp implements InterfaceDemoNew {
    public void abc() {
        System.out.println("In abc");
    };

    public void show() {
        System.out.println("In new show: overriding parent method alson works for interface's default method");
    }
}

public class InterfaceDefaultMethod {

    public static void main(String[] args) {
        DemoImp obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}