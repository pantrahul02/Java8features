package org.example.threads;


public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // First Employee object
        //Employee e2 = new Employee(); // Second Employee object

        // First thread operating on e1
        Thread t1 = new Thread(() -> e1.display(), "Thread-1");

        // Second thread operating on e2
        Thread t2 = new Thread(() -> e1.display(), "Thread-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}
