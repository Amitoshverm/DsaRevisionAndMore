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

        SalariedEmployee joe = new SalariedEmployee("joe", "02/12/1992", "19/09/2021", 3400000);
        System.out.println(joe);
        System.out.println(joe.collectPay());
        joe.retire();
        System.out.println(joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("mary", "13/01/2002","11/02/2020", 15);
        System.out.println(mary);
        System.out.println("marry's pay check = "+ mary.collectPay());
        System.out.println("marry's holiday pay = "+ mary.getDoublePay());
    }
}
