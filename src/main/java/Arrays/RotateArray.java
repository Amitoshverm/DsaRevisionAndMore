package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        int k = 2;
        int n = arr.length;
        reverse(arr, 0, k-1); 
        reverse(arr, k, n-1);
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int [] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
