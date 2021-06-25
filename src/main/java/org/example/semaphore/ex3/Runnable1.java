package org.example.semaphore.ex3;

public class Runnable1 implements Runnable{

    SharedResource resource;

    Runnable1(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.foo();
    }
}
