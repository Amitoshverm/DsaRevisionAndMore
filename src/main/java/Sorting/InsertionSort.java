package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // This sorting algo is used when some array elements are already sorted
        int[] arr = {10, 6, 14, 20, 2, 19};
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
