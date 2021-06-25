package org.example.semaphore.ex1;

public class SemaphoreMain {

    public static void main(String[] args) {

        NumberPrinter numberPrinter = new NumberPrinter();

        Thread evenThread = new Thread(new EvenPrinter(numberPrinter, 50));
        evenThread.setName("EVEN-THREAD");
        Thread oddThread = new Thread(new OddPrinter(numberPrinter, 50));
        oddThread.setName("ODD-THREAD");

        oddThread.start();
        evenThread.start();
    }

}
