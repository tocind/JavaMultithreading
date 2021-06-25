package org.example.semaphore.ex4;

import java.util.Map;
import java.util.concurrent.Semaphore;

public class SharedResource {

    private Map<Integer, Integer> integerMap;
    private static int count = 1;

    private Semaphore s1 = new Semaphore(1);
    private Semaphore s2 = new Semaphore(0);

    SharedResource(Map<Integer, Integer> integerMap) {
        this.integerMap = integerMap;
    }

    public void foo() {

        for (Map.Entry<Integer, Integer> var : integerMap.entrySet()) {

            try {

                s1.acquire();
                if (count % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + "-> " + var.getKey() + " " + var.getValue() + " count " + count);
                }
                count++;
                Thread.sleep(300);

            } catch (InterruptedException iex) {
            } finally {
                s2.release();
            }

        }
    }

    public void seek() {

        for (Map.Entry<Integer, Integer> var : integerMap.entrySet()) {

            try {

                s2.acquire();
                if (count % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + "-> " + var.getKey() + " " + var.getValue() + " count " + count);
                }
                count++;
                Thread.sleep(300);

            } catch (InterruptedException ix) {
            } finally {
                s1.release();
            }

        }

    }

}
