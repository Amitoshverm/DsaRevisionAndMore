package OOPs.Polymorphism.Challenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine() {
        System.out.println("starting the car");
    }
    public void drive() {
        System.out.println("driving the car, type is "+ getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine started running");
    }

    public static Car getCar(String type, String desc) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(desc);
            case 'E' -> new ElectricCar(desc);
            case 'H' -> new HybridCar(desc);
            default -> new Car(desc);
        };
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("spark ignited in gas car engine with all "+cylinders+" cylinders");
    }
}
class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {

        System.out.println("engine started silently on battery");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.println("started on gas with all "+cylinders+" cylinders, then shifted to battery");
    }
}

