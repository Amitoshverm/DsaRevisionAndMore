package FunWJava.concepts;

public class child2ForAbstract extends AbstractClass{
    @Override
    public void a() {
        System.out.println("prints a");
    }

    @Override
    public void b() {
        System.out.println("prints b");
    }

    @Override
    public void d() {
        System.out.println("prints d");
    }

    public static void main(String[] args) {
        InterFaceClass A = new child2ForAbstract();
        A.c();
    }
}

