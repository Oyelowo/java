
interface Abc {
    void show();
    
}

/* class Implimentor implements Abc {
    public void show() {
        System.out.print("implemnted");
    }
    
} */

public class AnonymousWithInterface {

    public static void main(String[] args) {
        // This cannot be reused but saves memory
        Abc obj = new Abc(){
                public void show() {
                    System.out.print("implemnted anoonymously");
                }
        };
        obj.show();
    }
    
}