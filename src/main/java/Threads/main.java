package Threads;

public class main {
    public static void main(String[] args) {
        Thread thread = new Thread();
        for (int i = 0; i < 10000; i++) {
            thread.setName("s1");
            System.out.println(thread.getName());
        }

    }
}
