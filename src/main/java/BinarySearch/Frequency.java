package BinarySearch;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 5, 5, 5};
        System.out.println(freq(arr, 5));


    }
    static int freq(int[] arr, int k) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int n = arr.length;
        int l = 0, r = n-1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (arr[mid] == k) {
                firstOccurrence = mid;
                r = mid-1;
            }
            else if (arr[mid] > k) {
                r = mid-1;
            }
            else {
                l = mid + 1;
            }
        }
        int left = 0, right = n-1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (arr[mid] == k) {
                lastOccurrence = mid;
                left = mid+1;
            }
            else if (arr[mid] > k) {
                right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }
        return lastOccurrence - firstOccurrence + 1;
    }
}
