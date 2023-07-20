package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Backtracking {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            swap(arr, 0, 1);
            System.out.println(Arrays.toString(arr));
        }


    }

    public static void swap(int[] arr, int i, int j) {
        while (j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }

}
