package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){

        int[] arr = {9, 6, 5, 3, 11, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //More number of swaps as compared to selection sort
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
