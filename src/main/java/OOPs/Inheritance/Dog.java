package OOPs.Inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "perky", "curled");
    }


    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "medium" : "big"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed.equals("slow")) {
            walk();
            waggingTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise() {
        if (type == "wolf") {
            System.out.print("Owwww");
        }
        else {
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("barking! ");
    }
    private void walk() {
        System.out.print("walking ");
    }
    private void run() {
        System.out.print("running ");
    }
    private void waggingTail() {
        System.out.print("Wagging tail ");
    }

}
