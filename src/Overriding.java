class D {
    public void show() {
        System.out.println("in D");
    }
}


class E extends D{
    public void show(){
        System.out.println("in E");
    }    


}

class F  extends D{
    public void show(){
        System.out.println("in F");
    }    
}


public class Overriding {

    //compille time and runtim polymorphism
    public static void main(String[] args) {
        D obj1 = new E(); //runtime polymorphism
        obj1.show();        
        obj1 = new F();
        obj1.show();  //Dynamic Method Dispatch, which is achieved by runtime polymorphism
    }
}

