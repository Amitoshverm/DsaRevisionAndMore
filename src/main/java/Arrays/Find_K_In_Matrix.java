package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_K_In_Matrix {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3, 11},
                        {4, 5, 6, 12},
                        {7, 8, 9, 13}
                        };

        System.out.println(Arrays.toString(sol(arr, 14)));
    }

    // Find target element in matrix
    public static int[] sol(int[][] A, int k) {
        int[] ans = new int[2];
        int i = 0, j = A[0].length-1;
        int n = A.length, m = A[0].length;

        while (i < n && j >= 0) {
            int curr = A[i][j];
            if (curr == k) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            else if (curr > k) {
                j--;
            }
            else {
                i++;
            }
        }
        return new int[]{-1, -1};
    }

}
