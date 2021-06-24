package org.example.test;

import java.util.concurrent.Semaphore;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {

//        Semaphore semaphore = new Semaphore(2);
//        semaphore.acquire();
//        System.out.println(semaphore.availablePermits());
//        semaphore.acquire();
//        System.out.println(semaphore.availablePermits());

        Semaphore semaphore2 = new Semaphore(0);
        semaphore2.release();
        System.out.println(semaphore2.availablePermits());

    }

    private static void compute(Semaphore semaphore) {

    }
}
