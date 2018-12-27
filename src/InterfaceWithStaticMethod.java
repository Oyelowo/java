interface Demo4{
    // By default, the below is final i.e constant. Variable also has to be instantiated and not just declared
    int num = 56;
    // this is an abstract method by default
    void abc();
    static void show(){
        System.out.println("Static method now works in interface from java 8");
    }
};

class Demo4Imp implements Demo4{
    public void abc() {
        // This won't work because the constant "num" is final
        // num = 5;
    }
    
}


public class InterfaceWithStaticMethod {

    public static void main(String[] args) {
        Demo4.show();
    }
}