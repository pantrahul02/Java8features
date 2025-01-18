package org.example.threads;

import java.util.concurrent.*;

class RejectedExecutionHandlerImpl implements java.util.concurrent.RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString() + "is rejected");
    }
}

public class ThreadDemo2 {

    public static void main(String[] args) {

        RunnableTask task = new RunnableTask();
        BlockingQueue queue = new ArrayBlockingQueue<Runnable>(3);
        ExecutorService threadPool = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, queue, new RejectedExecutionHandlerImpl() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            }
        });
        try {
            threadPool.execute(task);
            threadPool.execute(task);

            threadPool.execute(task);
            threadPool.execute(task);
            threadPool.execute(task);

            threadPool.execute(task);
            threadPool.execute(task);

            threadPool.execute(task);
        } finally {
            threadPool.shutdown();
        }
    }
}
