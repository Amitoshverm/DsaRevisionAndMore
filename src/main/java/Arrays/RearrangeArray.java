package Arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 0};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = n * arr[i];     // 15, 10, 5, 20, 0
        }
        for (int i = 0; i < n; i++) {
            int indx = arr[i] / n;   // 3, 2, 1, 4, 0

            int val = arr[indx]/n;   // arr[3]/5 = 4,  arr[2]/5 = 1, arr[1]/5 = 2, arr[4]/5 = 0, arr[0]/5 = 3
            arr[i] += val;           // 19, 6, 7, 20, 3
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] % n;     // 3, 1, 1, 4, 3
        }
        System.out.println(Arrays.toString(arr));
    }
}
