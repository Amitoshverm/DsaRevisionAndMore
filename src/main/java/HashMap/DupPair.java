package HashMap;

import java.util.HashMap;

public class DupPair {

    // Find pair such that arr[i] == arr[j] and j-i is minimum (closest duplicate paris).
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 1, 2, 3, 2, 1};
        System.out.println(sol(arr));
    }

    //T.C(n), S.C(n) optimized approach->
    public static int sol(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                ans = Math.min(ans, i - map.get(arr[i]));
                map.put(arr[i], i);
            }
            else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }


    // T.C(n2) brute force w/ little optimization ->
    public static int ans(int[] arr) {
        int n = arr.length;
        int dup = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int lastOccurrence = i;
            for (int j = lastOccurrence + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dup = Math.min(dup, j-i);
                    lastOccurrence = j;
                }
            }
        }
        return dup;
    }
}
