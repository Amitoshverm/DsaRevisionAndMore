package UdemySetup.Concurrency;

public class CustomThread implements Runnable{
    @Override
    public void run() {
        printNum();
    }

    public void printNum() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(1 +" "+ Thread.currentThread().getName());
        }
    }
}
