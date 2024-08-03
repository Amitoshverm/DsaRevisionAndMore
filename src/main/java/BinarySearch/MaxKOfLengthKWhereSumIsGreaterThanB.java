package BinarySearch;

public class MaxKOfLengthKWhereSumIsGreaterThanB {
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(sol(arr, 11));
    }

    public static int sol(int[] arr, int B) {
        int ans = 0;
        int l = 1, r = arr.length;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (check(arr, mid, B)) {
                ans = mid;
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return  ans;
    }

    public static boolean check(int[] arr, int k, int B) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum > B) {
            return false;
        }
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i-k];
            if (sum > B) {
                return false;
            }
        }
        return true;
    }
}
