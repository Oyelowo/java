/**
 * FirstCode
 */
public class FirstCode {
    public static void main(String[] args) {
       for (int i = 1; i < 117; i++) {
           char leta = 'A';
           for (int j = 1; j <= i; j++) {
               System.out.print(leta++);
           }
           System.out.println();
       }
    }
}
