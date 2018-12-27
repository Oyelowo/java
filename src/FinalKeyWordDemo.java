// final can be used for primitives and claa
// when used for primitives, it becomes a constant and cannot be changed
// when used on a class, the class cannot be extended
// It can also be used on a method, so that it cannot be overwritten in children classes


final class finalClass {
  // This class cannot be extended
    
}

class AB { 
    // This below is a constant and cannot be overwritten.
    private final int finalNumber = 45;

    // The below method cannot be overwritten in subclasses.
    public final void show() {
        System.out.println("in show");
    }
    
};

class BB extends AB{
    // The below does not work because it is a final method in the parent class
/*     public void show() {
        System.out.println("In BB show");
    } */
}


public class FinalKeyWordDemo {

    public static void main(String[] args) {
        BB obj  = new BB();
        obj.show();
    }
    
}