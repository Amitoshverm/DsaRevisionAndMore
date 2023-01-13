package Sorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {

        int[] arr = {8, 1, 3, 5, 6, 4, 9};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[]arr, int l, int r){
        if(l == r) {
            return;
        }
        int mid = l +(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid+1, r);
    }



    static void merge(int[] A, int l, int m, int r) {
        int[] arr = new int[r-l+1];

        int p1 = l, p2 = m, p3 = 0;
        while(p1 < m && p2 <= r) {
            if(A[p1] < A[p2]) {
                arr[p3] = A[p1];
                p1++;
                p3++;
            } else {
                arr[p3] = A[p2];
                p2++;
                p3++;
            }
        }
        while(p1 < m){
            arr[p3] = A[p1];
            p1++;
            p3++;
        }
        while(p2 <= r) {
            arr[p3] = A[p2];
            p2++;
            p3++;
        }
        for (int i = 0; i < r-l+1; i++) {
            A[l+i] = arr[i];
        }

    }
}
