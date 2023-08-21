package FunWJava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrayssss {
    public static void main(String[] args) {
        int[] arr = getIntegers(5);
       printArray(arr);
    }
    static int[] getIntegers(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200);
        }
        return arr;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
}
