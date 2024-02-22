package Arrays;

import java.util.HashMap;

public class SubArraySumLengthK {
    public static void main(String[] args) {
        int[] arr ={1, 3, 5 , 5, 1, 3};
        System.out.println(sol(arr, 2));


    }
    public static int sol(int[] A, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += A[i];
        }
        int max = sum;
        for (int i = k; i < A.length; i++) {
            sum = sum - A[i-k] + A[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
