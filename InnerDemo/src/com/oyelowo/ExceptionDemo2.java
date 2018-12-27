package com.oyelowo;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int i,j;
        i = -8;
        j = 9;

        try {
            int k = i/j;
            if (k==0){
                throw new OyelowoException("This is not possible");
            }
            System.out.println(k);
        }catch (OyelowoException e){
            System.out.println("Error " + e.getMessage());
        }


    }
}
