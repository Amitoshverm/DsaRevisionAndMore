package OOPs.Inheritance.AllAboutConstructos;

public class Constructor {
    private int x;
    private int y;
    private int height;
    private int breadth;

    // GOOD CONSTRUCTOR ->

    public Constructor() {
        this(0, 0);
    }
    public Constructor(int height, int breadth) {
        this(0,0,height,breadth);
    }
    public Constructor(int x, int y, int height, int breadth) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.breadth = breadth;
    }
}
