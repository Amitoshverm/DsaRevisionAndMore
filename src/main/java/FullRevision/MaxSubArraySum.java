package FullRevision;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanes(arr));
    }

    public static int kadanes(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
