package org.example.semaphore.ex4;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        Map<Integer, Integer> integerMap = getIntegerList();
        int fooCount = 1;
        int seekCount = 1;

        SharedResource sharedResource = new SharedResource(integerMap, fooCount, seekCount);
        Thread t1 = new Thread(new FirstRunnable(sharedResource), "first-thread");
        Thread t2 = new Thread(new SecondRunnable(sharedResource), "second-thread");

        t1.start();
        t2.start();

    }

    private static Map<Integer, Integer> getIntegerList() {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 1; i <= 100; ++i) {
            integerMap.put(i, i * 5);
        }
        return integerMap;
    }
}
