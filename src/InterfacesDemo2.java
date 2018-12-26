// using interface to achieve the concept of generalization


interface Abc {
    void show();
    
}

class Implimentor implements Abc {
    public void show() {
        System.out.print(obj);
    }
    
}

public class InterfacesDemo2 {

    public static void main(String[] args) {
        Abc obj = new Implimentor();
        obj.show();
        
    }
}