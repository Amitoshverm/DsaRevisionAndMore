package OOPs;

public class Student {

    private String id;
    private String name;
    private String DOB;
    private String classList;

    public Student(String id, String name, String DOB, String classList) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
