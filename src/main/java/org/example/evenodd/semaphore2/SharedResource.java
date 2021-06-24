package org.example.evenodd.semaphore2;

import java.util.List;
import java.util.concurrent.Semaphore;

public class SharedResource {

    List<Integer> integers;
    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(0);

    SharedResource(List<Integer> integers) {
        this.integers = integers;
    }

    public void foo() {
        for(int i = 1; i < integers.size(); i = i + 2) {
            try {
                s1.acquire();
                System.out.println(Thread.currentThread().getName()+" "+" "+i+"->"+integers.get(i-1));
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                s2.release();
            }
        }
    }

    public void seek() {
        for(int i = 2; i < integers.size(); i = i + 2) {
            try {
                s2.acquire();
                System.out.println(Thread.currentThread().getName()+" "+" "+i+"->"+integers.get(i-1));
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                s1.release();
            }
        }
    }

}
