package org.example.semaphore.ex1;

import java.util.concurrent.Semaphore;

public class NumberPrinter {

    private Semaphore semaphoreOdd = new Semaphore(1);
    private Semaphore semaphoreEven = new Semaphore(0);

    public void printOdd(int number) {
        try {
            semaphoreOdd.acquire();
            System.out.println(number + " -> " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphoreEven.release();
        }
    }

    public void printEven(int number) {
        try {
            System.out.println("AVAILABLE PERMITS"+ semaphoreEven.availablePermits());
            semaphoreEven.acquire();
            System.out.println(number + " -> " + Thread.currentThread().getName());
            System.out.println("AVAILABLE PERMITS"+ semaphoreEven.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphoreOdd.release();
        }

    }

}
