package Arrays;

import java.util.Arrays;


// total water accumulated
public class RainWaterTrap {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 4, 2, 3, 6, 8, 2, 3};
        System.out.println(sol(arr));
    }

    public static int sol(int[] arr) {

        int[] leftMax = new int[arr.length];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            leftMax[i] = Math.max(max, arr[i]);
            max = leftMax[i];
        }
        System.out.println(Arrays.toString(leftMax));

        int[] rightMax = new int[arr.length];
        int rmax = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            rightMax[i] = Math.max(rmax, arr[i]);
            rmax = rightMax[i];
        }
        System.out.println(Arrays.toString(rightMax));

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return  ans;

    }
}
