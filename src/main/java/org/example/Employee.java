package org.example;

public class Employee {
    private Perosn perosn;
    private int salary;

    public Employee(Perosn perosn, int salary) {
        this.perosn = perosn;
        this.salary = salary;
    }
    public void display(){
        System.out.println(perosn+" "+salary);
    }
}
