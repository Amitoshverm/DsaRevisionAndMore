package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        System.out.println(sol(arr));
    }

    // we need to take care of elements 1-->n if not present then n+1 is the answer
    public static int sol(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
             while (arr[i] > 0 && arr[i] < arr.length && arr[arr[i] -1 ] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[temp -1];
                arr[temp -1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                return i+1;
            }
        }
        return arr.length+1;
    }
}
