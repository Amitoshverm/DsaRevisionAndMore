package Arrays;

public class PatternPrinting {
    public static void main(String[] args) {
        //increasingTriangle(5);
        //decreasingTriangle(5);
        //rightIncreasingTriangle(5);
        rightDecreasingTriangle(5);
    }

    public static void increasingTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void decreasingTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightIncreasingTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightDecreasingTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
