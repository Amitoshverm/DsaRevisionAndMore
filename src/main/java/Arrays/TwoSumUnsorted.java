package Arrays;

import java.util.*;

public class TwoSumUnsorted {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 5};
        List<Integer> ar = List.of(2, 2,2);

        System.out.println(Arrays.toString(sol(arr, 14)));
    }
    /* In this approach we cannot use two pointers because use we are not sure the given array would be
    sorted or not so for general solution would look like this
    Using hashMap for searching.
    * Get the difference target - current element
    * Now search this difference in the map
     */
    public static int[] sol(int[] arr, int k) {
        int n = arr.length;
        int diff;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            diff = k - arr[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i};
            }
            else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
