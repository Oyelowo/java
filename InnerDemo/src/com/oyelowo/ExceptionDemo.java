package com.oyelowo;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a[] = new int[6];
            a[4] = 8;
            int i = 7;
            int j = 9;
            Number k = (float)i/j;
            System.out.println("Output is " + k);
        }catch (ArithmeticException e){
            System.err.println("Cannot be divided by 0" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("More than the limit");
        }catch (Exception e){
            System.err.println("Something went wrong");
        }
        finally {
            System.out.println("Bye");
        }

    }
}
