package OOPs.Inheritance;

public class example extends Object{
    public static void main(String[] args) {
        Student max = new Student("max", 19);
        System.out.println(max);
        primarySchool jimmy = new primarySchool("jimmy", 23, "Courtney");
        System.out.println(jimmy);
    }
    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }


        @Override
        public String toString() {
            return name+" "+ age;
//            return "Student{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    '}';
        }
    }
    static class primarySchool extends Student{
        private String parentsName;
        primarySchool(String name, int age, String parentsName) {
            super(name, age);
            this.parentsName = parentsName;
        }

        @Override
        public String toString() {
            return super.toString()+" "+parentsName;
        }
    }
}
