package FullRevision;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumTechniques {
    public static void main(String[] args) {

        int[] A = {2, 5, 7, 9, 11};
        int[] arr = {1, 5, 2, 3, 4, 6};
//        System.out.println(Arrays.toString(pair(A, 77)));
        System.out.println(Arrays.toString(pairsWhenUnsorted(arr, 9)));


    }

    // when array is sorted then two pointer is good appraoch

    public static int[] pairWhenSorted(int[] A, int k) {
        int n = A.length;
        int i = 0, j = n-1;
        while (i < j) {
            if (A[i] + A[j] == k) {
                return new int[]{i, j};
            }
            else if (A[i] + A[j] > k) {
                j--;
            }
            else {
                i++;
            }
        }
        return new int[]{-1, -1};

    }

    // if array is unsorted
    public static int[] pairsWhenUnsorted(int[] A, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int diff = k - A[i];
            if (hm.containsKey(diff)) {
                return new int[]{ hm.get(diff),i};
            }
            else {
                hm.put(A[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
