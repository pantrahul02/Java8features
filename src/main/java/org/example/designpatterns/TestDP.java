package org.example.designpatterns;

public class TestDP {
    public static void main(String[] args) {
        ThreadSafeDesignPattern e1 = ThreadSafeDesignPattern.getInstance();
        ThreadSafeDesignPattern e2 = ThreadSafeDesignPattern.getInstance();
        ThreadSafeDesignPattern e3 = ThreadSafeDesignPattern.getInstance();
        System.out.println(e1 +"\n " + e2 +"\n "+e3);

    }
}
