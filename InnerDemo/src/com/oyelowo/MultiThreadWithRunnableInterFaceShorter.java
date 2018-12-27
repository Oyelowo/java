package com.oyelowo;


public class MultiThreadWithRunnableInterFaceShorter {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                ;
            }
        }, "First Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                ;
            }
        }, "Second Thread");

        // Another way to set thread names
        //t1.setName("First Thread");
        //t2.setName("Second Thread");
        //System.out.println(t1.getName());
        //System.out.println(t2.getName());

        //t1.setPriority(1);
        //t2.setPriority(10);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        ;
        t2.start();

        System.out.println(t1.isAlive());

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }

}

