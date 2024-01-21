package Arrays;

import java.util.Arrays;

public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 2, 8, 6, 5, 10, 10, 11};
        int[] pf = new int[arr.length];
        pf[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]) {
                pf[i] = 0;
            }else {
                pf[i] = 1;
            }
        }
        System.out.println(Arrays.toString(pf));

        for (int i = 1; i < pf.length; i++) {
            pf[i] = pf[i-1] + pf[i];
        }
        System.out.println(Arrays.toString(pf));
    }

    public static boolean sol(int[] arr, int l, int r) {
        return true;
    }
}
