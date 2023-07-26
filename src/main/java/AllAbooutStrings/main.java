package AllAbooutStrings;

public class main {
    public static void main(String[] args) {
        String birthDate = "25/11/1999";
        int startingIndex = birthDate.indexOf("1999");
        System.out.println("Starting index of birthdate is " + startingIndex);
        System.out.println("birth year is " + birthDate.substring(startingIndex));

        String newDate = String.join("/", "09", "09", "1998");
        System.out.println(newDate);

        newDate = "23";
        newDate = newDate.concat("/");
        newDate = newDate.concat("04");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1999");
        System.out.println(newDate);
        System.out.println(newDate.replace('/', '-'));




        String str = "Hello World";
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println(str);
        System.out.println(stringBuilder);

        str.concat("and GoodBye");
        stringBuilder.append(" and GoodBye");
        System.out.println(str);
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(16).insert(16, 'g');
        System.out.println(stringBuilder);
    }
}
