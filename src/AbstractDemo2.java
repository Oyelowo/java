



class Printer {
    public void show(Number i) {
        System.out.println(i);
    }

}

public class AbstractDemo2 {

    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5.5544f);
    }
}