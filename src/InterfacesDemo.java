// Java does not support multiple inheritance
// When we work with class, we use extends, when we work with interface, we use implement

// in abstract class, u can have both abstract and normal method but in interfaces, you can have only abstract methods

// By default, all the methods in interfaces are public abstract and are not needed to be defined explicitly.
// You cannot create object of interface(e.g new Intferface()) because we do not have constructors in interface. You can only create a reference of it(e.g Interface variable). 

// In Abstract class -> here, you can declare and define method
// Interface -> Up till 1.7, you can only declare but not define. Now from java 1.8 , you can both define and declare methods in interface.
// Now, there is not much difference between interface and abstract class, but interfaces are mostly preferable.

// You can implement multiple interfaces but not extend multiple classes

// Always preferable to use interfaces when you don't want to define any method but just declare them. Even now, it is possible to define methods in interfaces, so can still be preferable.

interface Writer {
    // public abstract void write();
    // above same as below. The method would be public abstract by defualt.
    String NAME = "GOOD WRITER";
    void write();
}

class Pen implements Writer {
    public void write() {
        System.out.println("Im a pen from a " + Writer.NAME);
    }

}

class Pencil implements Writer {
    public void write() {
        System.out.println("Im a pencil");
    }

}

class Kit {
    public void doSomething(Writer p) {
        p.write();
    }

}

public class InterfacesDemo {

    public static void main(String[] args) {
        Kit k = new Kit();
        Pen p = new Pen();

        Pencil pc = new Pencil();

        // using as a reference also works
        Writer pcAlsoWorks = new Pencil();

        // however, cannot be used to create new object e.g
        /* Writer wontWork = new Writer();
        k.doSomething(wontWork); */

        k.doSomething(p);
        k.doSomething(pc);
        k.doSomething(pcAlsoWorks);
    }
}
