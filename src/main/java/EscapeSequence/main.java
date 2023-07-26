package EscapeSequence;

import java.sql.Time;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        String textBlock = """
                Print a Bulleted list:
                 \u2022 First Point 
                       \u2022 Sub Point\n""";
        System.out.println(textBlock);

        int age = 25;
        System.out.printf("Your age is %d \n", age);


        int birthYear = 2023 - 25;
        System.out.printf("Your age is %d and your date of birth is %d", age, birthYear);


        for (int i = 1; i <= 100000; i*=10) {
            System.out.printf("Printing %6d%n", i);
        }
    }
}
