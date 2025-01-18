package org.example.threads;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("*********");
    }
}
