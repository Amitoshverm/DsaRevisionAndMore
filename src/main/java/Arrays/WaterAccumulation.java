package Arrays;

public class WaterAccumulation {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 7, 3, 6, 5, 4, 1, 2};
        System.out.println(solve(arr));
    }

    public static int solve(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int i = 0, j = arr.length-1;
        while (i < j) {
            ans = Math.max(ans, Math.min(arr[j], arr[i]) * (j-i) );
            if (arr[i] < arr[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }

}
