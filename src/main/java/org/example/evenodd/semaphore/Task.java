package org.example.evenodd.semaphore;

import java.util.concurrent.Semaphore;

public class Task {

    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(0);

    Task(){
        initMap();
    }
    private void initMap(){

    }
    public void method1(){
        for (int i = 1; i <= 50; i = i + 2){
            try {
                s1.acquire();
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(700);
            } catch (InterruptedException iex){

            }finally {
                s2.release();
            }
        }
    }

    public void method2(){
        for (int i = 2; i <= 50; i = i + 2){
            try {
                s2.acquire();
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(700);
            } catch (InterruptedException iex){

            }finally {
                s1.release();
            }
        }
    }

}
