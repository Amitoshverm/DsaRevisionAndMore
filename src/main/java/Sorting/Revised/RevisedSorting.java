package Sorting.Revised;

import Sorting.SelectionSort;

import java.util.Arrays;
import java.util.Collections;

public class RevisedSorting {


    static void BubbleSort(int[] arr) {
        /*
        * O(n^2) in-place, and stable
        * minimum element swaps with its adjacent element
        * maximum swaps
         */
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    static void SelectionSort(int[] arr) {
        /* O(n^2), unstable, in-place-yes(not used any extra space)
         * Select minimum and swap to its correct position
         * less swap compared to bubble sort
         */
        for (int i = 0 ; i < arr.length-1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
           swap(arr, index, i);
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 4, 3, 0};
//        SelectionSort(arr);
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
