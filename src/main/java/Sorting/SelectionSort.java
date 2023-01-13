package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        /* This sort is used when no spacing is required to */
        int[] arr = {8, 9, 0, 4, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //can be preferred as compared to bubble sort for having less swaps
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
