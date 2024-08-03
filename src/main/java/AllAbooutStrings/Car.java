package AllAbooutStrings;

public class Car {

    private String name;
    private String color;
    private int topSpeed;
    private int gears;

//    public Car(String name, String color, int topSpeed, int gears) {
//        this.name = name;
//        this.color = color;
//        this.topSpeed = topSpeed;
//        this.gears = gears;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void getCarDetails() {
        System.out.println("Car is: "+ getName()+ " & color is: "+getColor()+ " with top speed of: "+ getTopSpeed());
    }

    public static void main(String[] args) {
        Car hondaCar = new HondaCar();
        hondaCar.setName("Accord");
        hondaCar.setGears(6);
        hondaCar.setColor("white");
        hondaCar.setTopSpeed(200);
        hondaCar.getCarDetails();
    }
}
