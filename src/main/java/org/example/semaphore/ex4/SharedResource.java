package org.example.semaphore.ex4;

import java.util.Map;
import java.util.concurrent.Semaphore;

public class SharedResource {

    private Map<Integer, Integer> integerMap;

    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(0);

    SharedResource(Map<Integer, Integer> integerMap) {
        this.integerMap = integerMap;
    }

    public void foo() {

    }

    public void seek() {

    }

}
