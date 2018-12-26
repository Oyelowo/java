class Calc {

    public int add(int ...args) {
        int sum = 0;
        for (int val : args) {
            sum+=val;
        }

        return sum;
    }
    
}

public class VaragsDemo {

    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(4, 77, 56,334,5, 98));
    }
}