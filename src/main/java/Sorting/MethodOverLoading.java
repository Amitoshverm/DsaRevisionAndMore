package Sorting;

public class MethodOverLoading {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(64));
        System.out.println(convertToCentimeters(5, 8));

    }

    public static double convertToCentimeters (int inches){
        return inches*2.54;
    }

    public static double convertToCentimeters (int feet, int inches){
        int feetToInches = 12*feet;
        inches += feetToInches;
        return convertToCentimeters(inches);
    }
}
