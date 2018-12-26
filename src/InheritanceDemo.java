import com.sun.javafx.runtime.SystemProperties;

class Calculator {
 
    public int add(int i, int j) {
        return i + j;
    }
    
}


class CalcAdv extends Calculator {

    public int sub(int i, int j) {
        return i - j;
    }
    
}

class CalcVeryAdv  extends CalcAdv{
    public int multi(int i, int j) {
        return i * j;
    }
    
}

public class InheritanceDemo {

    public static void main(String[] args) {
        CalcVeryAdv calc1 = new CalcVeryAdv();
        int result1 = calc1.add(43, 63);
        int result2 = calc1.sub(43, 63);
        int result3 = calc1.multi(54, 8);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        
    }
}