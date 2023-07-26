package OOPs.Inheritance;

public class circle {
    private double radius ;


    public circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }
    public double area(){
        return  radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
