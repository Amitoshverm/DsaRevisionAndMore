package BinarySearch;

public class NTasksMWorkers {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        System.out.println(books(arr, 2));
    }
    public static int books(int[] A, int B) {
        int l = Integer.MIN_VALUE;
        int r = 0;
        for (int i = 0; i < A.length; i++) {
            l = Math.max(l, A[i]);
        }
        System.out.println(l);
        for (int i = 0; i < A.length; i++) {
            r += A[i];
        }
        System.out.println(r);
        int ans = 0;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (check(A, mid, B) ) {
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static boolean check(int[] arr, int mid, int k) {
        int curr_page = arr[0];
        int student = 1;
        for (int i = 1; i < arr.length; i++) {
            if (curr_page + arr[i] > mid) {
                student++;
                curr_page = arr[i];
            }
            else {
                curr_page += arr[i];
            }
        }
        if (student <= k) {
            return true;
        }
        return false;
    }
}
