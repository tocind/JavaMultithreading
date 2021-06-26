package org.example.semaphore.ex4;

import java.util.Map;
import java.util.concurrent.Semaphore;

public class SharedResource {

    private Map<Integer, Integer> integerMap;
    private int fooCount;
    private int seekCount;

    private Semaphore s1 = new Semaphore(1);
    private Semaphore s2 = new Semaphore(0);

    SharedResource(Map<Integer, Integer> integerMap, int fooCount, int seekCount) {
        this.integerMap = integerMap;
        this.fooCount = fooCount;
        this.seekCount = seekCount;
    }

    public void foo() {

        for (Map.Entry<Integer, Integer> var : integerMap.entrySet()) {

            try {

                s1.acquire();
                if (fooCount % 2 != 0) {
                    System.out.println(Thread.currentThread().getName()+"::: KEY -> " + var.getKey() + " VALUE-> " + var.getValue());
                }
                fooCount++;
                Thread.sleep(300);

            } catch (InterruptedException iex) {
                iex.printStackTrace();
            } finally {
                s2.release();
            }

        }
    }

    public void seek() {

        for (Map.Entry<Integer, Integer> var : integerMap.entrySet()) {

            try {

                s2.acquire();
                if (seekCount % 2 == 0) {
                    System.out.println(Thread.currentThread().getName()+"::: KEY -> " + var.getKey() + " VALUE-> " + var.getValue());
                }
                seekCount++;
                Thread.sleep(300);

            } catch (InterruptedException iex) {
                iex.printStackTrace();
            } finally {
                s1.release();
            }

        }

    }

}
