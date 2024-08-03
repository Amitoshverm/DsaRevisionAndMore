package FullRevision;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 2, 6, 11, 8, 9};
        System.out.println(triplets(arr, 10));
    }

    /*
    * In Three sum the brute force will take o(n^3) taking 3 loops.
    * But if the array is sorted then it will come down to O(n^2) one loop for fixing one element and then our
    normal two pointers approach.
    * If the array is unsorted then we have no option to sort it first then use two pointers which will be o(n^2) eventually.
    * Hash Table can be used but still it would be o(n^2) with space of o(n)
     */

    public static int triplets(int[] A, int k) {
        if (A.length < 3) {
            return -1;
        }
        Arrays.sort(A);
        int ans = 0;
        int l;
        int r = A.length-1;
        for (int i = 0; i < A.length-2; i++) {
            l = i+1;
            while (l < r) {
                if (A[i] + A[l] + A[r] == k) {
                    ans++;
                    l++;
                    r--;
                }
                else if (A[i] + A[l] + A[r] > k) {
                    r--;
                }
                else {
                    l++;
                }
            }
        }
        return ans;
    }
}
