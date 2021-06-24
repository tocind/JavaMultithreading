package org.example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorServiceEx1 {
    public static void main(String[] args) throws InterruptedException {

        int numberOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(numberOfCores);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 1; i <= 50; ++ i){
            Thread.sleep(400);
            executorService.submit(new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            }));
        }
        executorService.shutdown();
    }
}
