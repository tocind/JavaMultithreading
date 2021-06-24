package test;

public class MainClass {

    private int a = 1;
    private boolean flag = false;

    private void m1() {

        while (flag) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
        }
        a++;
        flag = true;
    }

    private void m2() {

        while (!flag) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
        }
        System.out.println(a);
        flag = false;
    }

    public static void main(String[] args) throws InterruptedException {

        MainClass m = new MainClass();

        for (int i = 0; i < 100; ++i) {
            Thread a = new Thread(m::m1);
            Thread b = new Thread(m::m2);
            a.start();
            b.start();
        }

    }

}
