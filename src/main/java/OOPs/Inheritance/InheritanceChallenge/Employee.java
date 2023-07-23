package OOPs.Inheritance.InheritanceChallenge;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeIdNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeIdNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
