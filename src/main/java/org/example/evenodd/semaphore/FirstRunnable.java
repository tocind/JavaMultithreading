package org.example.evenodd.semaphore;

public class FirstRunnable implements Runnable{

    Task task;
    FirstRunnable(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        task.method1();
    }
}
