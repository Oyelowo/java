// Java does not support multiple inheritance
// When we work with class, we use extends, when we work with interface, we use implement

// in abstract class, u can have both abstract and normal method but in interfaces, you can have only abstract methods

// By default, all the methods in interfaces are public abstract and are not needed to be defined explicitly
// You cannot create object of interface(e.g new Intferface()), you can only create a reference of it(e.g Interface variable). 

// You can implement multiple interfaces but not extend multiple classes

// Always preferable to use interfaces when you don't want to define any method but just declare them

interface Writer {
   // public abstract void write();
   // above same as below. The method would be public abstract by defualt.
   void write();
}


class Pen implements Writer{
    public void write() {
        System.out.println("Im a pen");
    }

}


class Pencil implements Writer{
    public void write() {
        System.out.println("Im a pencil");
    }

}

class Kit {
    public void doSomething(Writer p) {
        p.write();
    }

}

public class InterfacesDemo{

    public static void main(String[] args) {
        Kit k = new Kit();
        Pen p = new Pen();

        Pencil pc = new Pencil();

        k.doSomething(pc);
    }
}

