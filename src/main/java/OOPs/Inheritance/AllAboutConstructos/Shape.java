package OOPs.Inheritance.AllAboutConstructos;

public class Shape {
    private int x;
    private int y;
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 class Cirle extends Shape{
    private int r;

    public Cirle(int r) {
        this(0, 0, r);
    }
    public Cirle (int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
}
