package UdemySetup.Concurrencyy;


public class main {
    public static void main(String[] args) {

//        CustomThread customThread = new CustomThread();
//        Thread t1 = new Thread(customThread);
//        t1.start();
//
//
//        Runnable runnable = () -> {
//            for (int i = 1; i <=3; i++) {
//                System.out.print(2 +" ");
//            }
//            try{
//                Thread.sleep(2500);
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//        Thread t2 = new Thread(runnable);
//        t2.run();
        System.out.println(Thread.currentThread().getName()+" is running");
        try{
            System.out.println("Thread will pause for 2 seconds");
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            throw new RuntimeException();
        }
        Thread t1 = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println(tname+ " should take 10 dots to run");
            for (int i = 0; i < 10; i++) {
                System.out.print(". ");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(tname + " got interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("\n" + tname + " completed");
        });
        System.out.println(t1.getName() + " Starting");
        t1.start();

        Thread installThread = new Thread(() -> {
            try {
                for (int i = 0 ; i < 3; i++ ) {
                    Thread.sleep(250);
                    System.out.println("Installation step " + (i + 1) + " is completed");
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "installThread");


//        System.out.println("Main thread would continue here");
//        long now = System.currentTimeMillis();
//        while (t1.isAlive()) {
//            System.out.println("\n" + " waiting for thread to complete");
//            try {
//                Thread.sleep(1000);
//                System.out.println("B. state = " + Thread.currentThread().getState());
//                if (System.currentTimeMillis()- now > 2000) {
//                    t1.interrupt();
//                }
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (!t1.isInterrupted()) {
            installThread.start();
        }

    }
}
