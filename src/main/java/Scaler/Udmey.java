package Scaler;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Udmey {
    public static void main(String[] args) {
//        System.out.println(solve(25));
//        System.out.println(solve(8, 1));
//        solve(true, 0);
    }

    public static boolean solve(int a) {
        return a >= 13 && a <= 19;
    }

    public static int solve(int a, int b) {
        return a + b;
    }
    public static void solve(boolean b, int hour) {
        if (b && (hour >1 && hour<23)) {
            System.out.println("bark");
        } else {
            System.out.println("don't bark");
        }
    }


}
