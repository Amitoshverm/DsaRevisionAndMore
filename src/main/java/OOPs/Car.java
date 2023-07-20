package OOPs;


public class Car {
    private String make = "Hyundai";
    private String model = "Santro";
    private String color = "white";
    private int door = 4;
    private boolean convertable = false;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) {
            make = "Unsupported";
        }
        String lowerCase = make.toLowerCase();
        switch (lowerCase) {
            case "porsche", "hyundai", "ferrari" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void describeCar() {
        System.out.println(door+"-doors "+
                color+ " "+
                make+" " +
                model+" "+
                (convertable ? "Convertable" : " "));
    }
}
