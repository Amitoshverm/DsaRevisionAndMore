package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = {8, 1, 3, 6, 11, 2, 4, 9, 7, 6};
        merge(A, 2, 5, 7);
        System.out.println(Arrays.toString(A));
    }
    static int[] merge(int[] A, int l, int m, int r) {
        int[] arr = new int[r-l+1];

        int p1 = l, p2 = m, p3 = 0;
        while(p1 < m && p2 <= r) {
            if (A[p1] < A[p2]) {
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
        return A;

    }

}