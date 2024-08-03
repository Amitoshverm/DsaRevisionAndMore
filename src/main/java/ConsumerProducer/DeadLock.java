package ConsumerProducer;

public class DeadLock {
    public static void main(String[] args) {

        String obj1 = "amitosh";
        String obj2 = "avisha";

        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj2) {
                    System.out.println("lock acquired");
                }
            }
        }, "thread1");

        Thread t2 = new Thread(() ->{
            synchronized (obj2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj1) {
                    System.out.println("lock acquired");
                }
            }
        }, "thread2");

        t1.start();
        t2.start();
    }
}
