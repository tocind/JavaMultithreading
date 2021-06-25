package org.example.semaphore.ex2;

public class SecondRunnable implements Runnable {

    Task task;

    SecondRunnable(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.method2();
    }
}
