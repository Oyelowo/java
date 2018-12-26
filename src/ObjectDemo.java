/**
 * ObjectDemo
 */
/**
 * Class
 */
class Casio {

    int num1;
    int num2;
    String operation;
    public  Casio() {
        num1= 0;
        num2=0;
        operation = "Nothing";
    }

    public Casio(int i) {
        num1 = i;
        num2 = 0;
        operation = "Nothing";
    }

    public Casio(int i, int j, String op) {
        num1 = i;
        num2= j;
        operation = op;
    }

    
  public void add(int i, int j) {
      System.out.println(i+j);
  }

  public void add(double i, double j) {
    System.out.println(i+j);
}

  public void add(int i, int j, int k) {
    System.out.println(i+j + k);
}  
}



public class ObjectDemo {

    public static void main(String[] args) {
        Casio myCalc = new Casio(4, 5, "Add");
        myCalc.add(300, 5);

        myCalc.add(78, 56, 767);

        myCalc.add(300.656, 5.354);
        
    }
}