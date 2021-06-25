package org.example.semaphore.ex3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Integer> integers = getIngegerList();

        SharedResource sharedResource = new SharedResource(integers);
        Thread t1 = new Thread(new Runnable1(sharedResource));
        Thread t2 = new Thread(new Runnable2(sharedResource));

        t1.start();
        t2.start();

    }

    private static List<Integer> getIngegerList() {
        List<Integer> integers = new ArrayList<>();
        for ( int i = 1; i < 100; ++i) {
            integers.add(i*2);
        }
        return integers;
    }
}
