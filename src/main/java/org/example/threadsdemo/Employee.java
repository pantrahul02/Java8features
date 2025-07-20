package org.example.threadsdemo;

public class Employee {

    public synchronized void printDetails() {
        System.out.println(Thread.currentThread().getName() + " is printing employee details.");
        try {
            Thread.sleep(2000); // Simulating a delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " has finished printing employee details.");
    }
}
