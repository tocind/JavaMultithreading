package org.example.semaphore;

public class EvenPrinter implements Runnable{

    private NumberPrinter numberPrinter;
    private int limit;

    EvenPrinter(NumberPrinter numberPrinter, int limit){
        super();
        this.numberPrinter = numberPrinter;
        this.limit = limit;
    }

    @Override
    public void run() {
        for(int i = 2; i <= limit; i = i + 2){
            numberPrinter.printEven(i);
        }
    }
}
