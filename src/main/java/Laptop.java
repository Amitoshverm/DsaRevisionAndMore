public class Laptop {
    private String details;
    private int price;

    public Laptop(String details, int price) {
        this.details = details;
        this.price = price;
    }
    // details format - "ram/storage/"
    public String getDetails() {
        return details;
    }

    public int getPrice() {
        return price;
    }

    public void isGood(Laptop laptop) throws Exception {
        String str = laptop.getDetails().substring(0,1);
        int ram = Integer.parseInt(str);
        if (ram > 8) {
            System.out.println("its a good laptop");
        }
        else {
            System.out.println("dont go for it");
        }
    }

    public static void main(String[] args) throws Exception {
        Laptop laptop = new Laptop("6/256/8", 32000);
        laptop.isGood(laptop);
    }
}


