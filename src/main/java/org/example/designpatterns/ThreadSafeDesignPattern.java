package org.example.designpatterns;

import org.example.singleton.ThreadSafeSingleton;

public class ThreadSafeDesignPattern {

    private static ThreadSafeDesignPattern instance;

    private ThreadSafeDesignPattern() {
    }

    public static ThreadSafeDesignPattern getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDesignPattern.class) {
                if (instance == null) {
                    instance = new ThreadSafeDesignPattern();
                }
            }
        }
        return instance;
    }
}
