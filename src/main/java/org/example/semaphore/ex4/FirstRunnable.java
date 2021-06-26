package org.example.semaphore.ex4;

public class FirstRunnable implements Runnable {

    private SharedResource resource;

    FirstRunnable(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.foo();
    }
}
