package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {
    // input => [1,2,-2,4,-4]
    // output => [2,-2,4,-4]    this is the longest sequence
    public static void main(String[] args) {
        int[] arr = {1,2,-2,4,-4};
        System.out.println(Arrays.toString(solve(arr)));
    }
    public static int[] solve(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = A.length;
        int[] pfx = new int[n];

        // first we will get prefix sum
        pfx[0] = A[0];
        for (int i = 1; i < n; i++) {
            pfx[i] = pfx[i-1] + A[i];
        }
        int length = Integer.MIN_VALUE;
        int l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(pfx[i])) {
                int currLength = i - map.get(pfx[i]);
                if (currLength > length) {
                    l = map.get(pfx[i])+1;
                    r = i;
                    length = currLength;
                }
            }
            else {
                map.put(pfx[i], i);
            }
        }
        if (length > 0) {
            int[] ans = new int[length];
            for (int i = l, j = 0; i <= r; i++, j++) {
                ans[j] = A[i];
            }
            return ans;
        }
        else {
            int[] ans ={};
            return ans;
        }
    }
}
