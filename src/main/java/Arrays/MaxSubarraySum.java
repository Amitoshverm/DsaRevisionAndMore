package Arrays;

import java.util.Arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 0, 3, -1, -2, -3, 5, 6, 7};
        System.out.println(Arrays.toString(sol(arr)));
    }

    // suppose we have  2 0 3 -1 -2 -4 5, 6, 7
    //                  2 2 5  0  0  0 5  11 18 ans -> 18


    public static int[] sol(int[] arr) {

        int n = arr.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ends_here = 0;
        int s = 0, e = 0;

        int[] ans = {-1, -1};

        for (int i = 0; i < n; i++) {
            max_ends_here += arr[i];
            if (max_ends_here > max_so_far) {
                max_so_far = max_ends_here;
                e = i;
            }
            if (max_ends_here < 0) {
                max_ends_here = 0;
                s = i + 1;
            }
        }
        ans[0] = s;
        ans[1] = e;
        return ans;
    }
}
