package BinarySearch;

public class SearchKInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        System.out.println(solve(arr, 6));
    }

    public static int solve(int[] arr, int k) {
        int n = arr.length-1;
        int l = 0, r = n-1;
        int t = 0;
        while (l < r) {
            int mid = l + (r-l)/2;
            if (arr[mid] >= arr[0]) {
                l = mid + 1;
            }
            else if (arr[mid] < arr[0]) {
                t = mid;
                r = mid - 1;
            }
        }
        int ans = 0;
        if (k > arr[0]) {
            ans = bs(arr, 0, t-1, k);
        }else {
            ans = bs(arr, t, n-1, k);
        }
        return ans;

    }

    public static int bs(int[] arr, int l, int r, int k) {
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (arr[mid] == k) {
                return mid;
            }
            else if (arr[mid] > k) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
