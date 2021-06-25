package org.example.semaphore.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        Map<Integer, Integer> integerMap = getIngegerList();

        SharedResource sharedResource = new SharedResource(integerMap);
        Thread t1 = new Thread(new Runnable1(sharedResource));
        Thread t2 = new Thread(new Runnable2(sharedResource));

        t1.start();
        t2.start();

    }

    private static Map<Integer, Integer> getIngegerList() {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for ( int i = 1; i < 100; ++i) {
            integerMap.put(i, i * 5);
        }
        return integerMap;
    }
}
