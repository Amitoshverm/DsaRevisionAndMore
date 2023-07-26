package OOPs.Inheritance;

public class Cylinder extends circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0 ){
            height = 0;
        }
        this.height = height;
    }
    public double getHeight() {
        return  height;
    }
    public double volume () {
        return area() * height;
    }
}
