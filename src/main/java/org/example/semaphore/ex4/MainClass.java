package org.example.semaphore.ex4;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        Map<Integer, Integer> integerMap = getIntegerList();

        SharedResource sharedResource = new SharedResource(integerMap);
        Thread t1 = new Thread(new FirstRunnable(sharedResource));
        Thread t2 = new Thread(new SecondRunnable(sharedResource));

        t1.start();
        t2.start();

    }

    private static Map<Integer, Integer> getIntegerList() {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for ( int i = 1; i < 100; ++i) {
            integerMap.put(i, i * 5);
        }
        return integerMap;
    }
}
