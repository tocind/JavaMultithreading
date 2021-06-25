package org.example.semaphore.ex3;

public class FooRunnable implements Runnable{

    SharedResource resource;

    FooRunnable(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.foo();
    }
}
