package org.example.evenodd.semaphore;

public class MainClass {
    public static void main(String[] args) {

        Task task = new Task();

        Thread t1 = new Thread(new FirstRunnable(task), "first_thread");
        Thread t2 = new Thread(new SecondRunnable(task), "second_thread");
        t1.start();
        t2.start();
    }


}
