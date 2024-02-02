package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class subArrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, -3, 4, 3, 1, -8, 6, -2, -1};
        System.out.println(sol(arr));
    }
    public static int sol(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;

        // get prefix sum array
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                ans = Math.max(ans, i - map.get(arr[i]));
               // map.put(arr[i], i);
            }
            else
            {
                map.put(arr[i], i);
            }
        }
        return ans;
    }
}
