package org.example.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableOne callableOneTask = new CallableOne();

        ExecutorService task = Executors.newCachedThreadPool();

        Future<Integer> f1 = task.submit(callableOneTask);
        Future<Integer> f2 = task.submit(callableOneTask);

        System.out.println("future is done ? " + f1.isDone());
        System.out.println("future is done ? " + f2.isDone());

        System.out.println(f1.get());
        System.out.println(f2.get());

        System.out.println("future is done ? " + f1.isDone());
        System.out.println("future is done ? " + f2.isDone());


    }
}
