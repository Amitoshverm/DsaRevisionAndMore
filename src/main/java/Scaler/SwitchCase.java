package Scaler;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        System.out.println(getQuarterOfTheMonth("jan"));

    }

    public static String getQuarterOfTheMonth(String month) {
        return switch (month) {
            case "jan", "feb", "mar" -> "first";
            case "apr", "may", "june" -> "second";
            case "jul", "aug", "sept" -> "third";
            case "oct", "nov", "dec" -> "fourth";
            default -> "bad";
        };
    }
}
