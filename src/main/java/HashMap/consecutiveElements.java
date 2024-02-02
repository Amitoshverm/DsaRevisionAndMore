package HashMap;

import java.util.HashSet;

public class consecutiveElements {
    public static void main(String[] args) {
        int[] arr = {-1, 8, 2, 3, 7, 1, 4, 9};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int c = 1;
                int x = arr[i] + 1;
                while (set.contains(x)) {
                    c++;
                    x++;
                }
                ans = Math.max(c, ans);
            }
        }
        return ans;
    }
}
