package FunWJava;

import java.util.Arrays;
import java.util.Stack;

public class equilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, -6, 5, -2, -1};
        System.out.println(index(arr));

    }
    public static int index(int [] arr) {
        // creating prefix sum array
        int n = arr.length-1;
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(arr));

        if (arr[n] - arr[0] == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i-1] == arr[n] - arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
