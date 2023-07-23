package OOPs.Inheritance.InheritanceChallenge;

public class main {
    public static void main(String[] args) {
        Employee davis = new Employee("davis", "13/04/1998", "12/08/2023");
        System.out.println(davis);
        System.out.println("age :" + davis.getAge());
        System.out.println("pay: " + davis.collectPay());

        Employee shreya = new Employee("shreya vats", "24/04/1999", "13/04/2020");
        System.out.println(shreya);
        System.out.println("age" + shreya.getAge());
        System.out.println("pay" + shreya.collectPay());
    }
}
