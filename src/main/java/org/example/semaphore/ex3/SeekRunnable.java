package org.example.semaphore.ex3;

public class SeekRunnable implements Runnable{

    SharedResource resource;

    SeekRunnable(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.seek();
    }
}
