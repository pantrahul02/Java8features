package org.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo1 {
    public static void main(String[] args) {
        RunnableTask runnableTask  = new RunnableTask();
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        threadPool.execute(runnableTask); //pool-1-thread-1
        threadPool.execute(runnableTask); //pool-1-thread-2
        threadPool.execute(runnableTask); //pool-1-thread-3

        threadPool.execute(runnableTask); //added in queue
        threadPool.execute(runnableTask); //added in queue

        threadPool.shutdown();
    }
}
