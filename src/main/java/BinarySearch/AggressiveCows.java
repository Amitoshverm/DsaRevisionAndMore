package BinarySearch;

public class AggressiveCows {
    // M cows can be placed at min distance
    // i.e. Minimise the maximum distance between the cows

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        System.out.println(sol(arr, 3));
    }

    public static int sol(int[] arr, int M) {
        int l = 1, r = arr[arr.length-1] - arr[0];
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (check(arr, mid, M)) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public static boolean check(int[] arr, int mid, int M) {
        int cow = 1;
        int last_placed = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - last_placed >= mid) {
                cow++;
                last_placed = arr[i];
                if (cow == M) {
                    return true;
                }

            }
        }
        return false;
    }
}
