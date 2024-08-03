package UdemySetup.Concurrencyy;
public class thread1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is starting");
            for (int i = 1; i <= 10; i+=2) {
                System.out.print(i +" ");
            }
            try {
                Thread.sleep(200);
            }catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        } , "t1");
        t1.run();

        CustomThread customThread = new CustomThread();
        Thread t2 = new Thread(customThread);
        t2.start();
    }
}
