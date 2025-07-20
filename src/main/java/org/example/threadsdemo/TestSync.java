package org.example.threadsdemo;

public class TestSync {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Thread t1 = new Thread(() -> emp1.printDetails(), "Thread-1");
        //Thread t2 = new Thread(() -> emp2.printDetails(), "Thread-2");
        Thread t2 = new Thread(() -> emp1.printDetails(), "Thread-2");
        t1.start();
        t2.start();
    }
}
