package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-5, 2, 3, 6, 9, 10, 11, 15, 18};
        System.out.println(floor(arr, 5));
    }
    static int floor(int[] arr, int k) {
        int n = arr.length;;
        int l = 0, r = n-1;
        int ans = n;

        while (l <= r) {
            int mid = l + (r - l)/2;
            if (arr[mid] == k) {
                return arr[mid];
            }
            else if (arr[mid] > k) {
                r = mid - 1;
            }
            else {
                ans = arr[mid];
                l = mid + 1;
            }
        }
        return ans;
    }
}
