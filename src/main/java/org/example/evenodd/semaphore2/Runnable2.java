package org.example.evenodd.semaphore2;

public class Runnable2 implements Runnable{

    SharedResource resource;

    Runnable2(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.seek();
    }
}
