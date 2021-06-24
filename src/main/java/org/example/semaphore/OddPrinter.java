package org.example.semaphore;

public class OddPrinter implements Runnable{

    private NumberPrinter numberPrinter;
    private int limit;

    OddPrinter(NumberPrinter numberPrinter, int limit){
        super();
        this.numberPrinter = numberPrinter;
        this.limit = limit;
    }

    @Override
    public void run() {
        for(int i = 1; i <= limit; i = i + 2){
            numberPrinter.printOdd(i);
        }
    }
}
