// io exceptions are checked but runtime exceptions are unchecked
// computer prompts you to handle the error of the exceptions it automatically knows about(checks)
// this can be handled with try catch block or throws Exception
// objects that belong to the io class are resource objects and it is always good to close
// close them when done with them, to prevent them from occupying memory.
// always close resource in finally block if using try catch finally
package com.oyelowo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number");

        // Try with resource. This is done to  enable the autoclosing of br.(instead of stating br.close() automatically.
        // works from java 1.7
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))) {

            n = Integer.parseInt(br.readLine());
        }

        System.out.println(n);
    }
}
