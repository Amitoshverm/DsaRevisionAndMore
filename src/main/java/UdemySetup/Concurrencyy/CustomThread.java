package UdemySetup.Concurrencyy;

public class CustomThread implements Runnable{
    @Override
    public void run() {
        printNum();
    }
    public void printNum() {
        System.out.println("\n"+ Thread.currentThread().getName() + " is starting");
        for (int i = 2; i <= 10; i+=2) {
            System.out.print(i +" ");
            try {
                Thread.sleep(200);
            }catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}
