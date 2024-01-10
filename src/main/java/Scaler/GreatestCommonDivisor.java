package Scaler;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(24, 36));

    }

    public static int gcd(int a, int b) {
        if (a > b) {
            swap(a, b);
        }
        while (a > 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
    public static void swap(int a, int b) {
        b = a;
    }
}
