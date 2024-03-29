package org.example.semaphore.ex3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Integer> integers = getIntegerList();

        SharedResource sharedResource = new SharedResource(integers);
        Thread t1 = new Thread(new FooRunnable(sharedResource));
        Thread t2 = new Thread(new SeekRunnable(sharedResource));

        t1.start();
        t2.start();

    }

    private static List<Integer> getIntegerList() {
        List<Integer> integers = new ArrayList<>();
        for ( int i = 1; i < 100; ++i) {
            integers.add(i*2);
        }
        return integers;
    }
}
