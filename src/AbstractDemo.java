abstract class Human {
    // When you don't want to define the method, you can use abstract method and it has to be defined in the children classes
    public abstract void eat();

    public void walk() {
        
    }
}

// concrete class
class Man extends Human {
    public void eat() {
        System.out.println("I eat");
    }
}



public class AbstractDemo {
    public static void main(String[] args) {
        Human obj = new Man();
        obj.eat();
    }
}