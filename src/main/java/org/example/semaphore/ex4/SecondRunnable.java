package org.example.semaphore.ex4;

public class SecondRunnable implements Runnable {

    private SharedResource resource;

    SecondRunnable(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.seek();
    }
}
