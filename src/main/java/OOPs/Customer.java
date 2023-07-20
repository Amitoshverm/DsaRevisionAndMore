package OOPs;

public class Customer {
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public Customer() {
        this("defaultName", "defaultEmail");
    }
    public Customer(String name, String email) {
        this(name, 10000, email);
    }
}
