package BinarySearch;

public class PeekElementInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 9, 3, 2};
        System.out.println(peek(arr));

    }
    // An element is peek when it is greater than both of the neighbour(left and right)
    // Array begins from -∞ to -∞
    public static int peek(int[] arr) {
        int n = arr.length;
        // base cases
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[n-1] > arr[n-2]) {
            return n-1;
        }
        if (n == 1) {
            return 0;
        }
        int l = 1, r = n-1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if (arr[mid] > arr[mid - 1]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
