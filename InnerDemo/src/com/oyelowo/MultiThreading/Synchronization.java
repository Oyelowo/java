package com.oyelowo.MultiThreading;


class Counter {
    int count;

    // make this method synchronized so that two threads cannot access it at the same time.
    // This keeps it safe and enables the operations to be performed separately
    public synchronized void increment() {
        count++;  // count = count + 1
    }
}

public class Synchronization {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count " + c.count);

    }
}
