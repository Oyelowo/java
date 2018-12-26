// int, float, double

// Primitive is faster..

// wrapper classes are required e.g in collection. In this cases, primitive don't work.

public class Wrapper {

    public static void main(String[] args) {
        int i = 5; // Primitive datatype
        Integer ii = new Integer(5);   // Wrapper class

        // Boxing/Wrapping means putting a reference data into a reference wrapper object e.g
        Integer boxed = new Integer(i); 

        // Unboxing or Unwrapping
        int unboxed = boxed.intValue();

        Integer autoBoxedValue = i;   // Auto-Boxing. The new Ineteger declaration is done automatically

        int autoUnboxed = autoBoxedValue;

        String str = "1244";
        int n = Integer.parseInt(str);
        System.out.println(n);

    }
}