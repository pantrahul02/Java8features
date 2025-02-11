package org.example.threads;

import java.util.concurrent.Callable;

public class CallableOne implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        try{
            Thread.sleep(20*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("********");
        return 123;
    }
}
