package BinarySearch;

public class Rough {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,20,19,18,17,16,15,14,13,12,11};
        System.out.println(solve(arr, 12));
    }
    public static int sol(int[] arr, int k) {
        int l = 0, r = arr.length-1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (arr[mid] == k) {
                ans = mid;
                l = mid + 1;
            }
            else if (arr[mid] > k) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public static int solve(int[] A, int B) {
        int peek_point = peek(A);
        int high = bs(A, 0, peek_point, B);
        int low = bs(A, peek_point+2, A.length-1, B);
        if (high != -1) {
            return high;
        }
        else {
            return low;
        }
    }
    public static int peek(int[] A) {
        int n = A.length;
        if (A.length == 1) {
            return 0;
        }
        if (A[0] > A[1]) {
            return 0;
        }
        if (A[n-1] > A[n-2]) {
            return n - 1;
        }
        int l = 1, r = n - 2;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (A[mid] > A[mid-1] && A[mid] > A[mid+1]) {
                return mid;
            }
            else if (A[mid] > A[mid - 1]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
    public static int bs(int[] A, int l, int r, int k) {
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (A[mid] == k) {
                return mid;
            }
            else if (A[mid] > k) {
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }

}
