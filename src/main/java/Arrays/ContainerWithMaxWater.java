package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerWithMaxWater {
    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(sol(arr));
        ArrayList<Integer> ar = new ArrayList<>(List.of(1, 2, 3, 4, 5, 5));
        Collections.reverse(ar);
        System.out.println(ar);

    }


    // using two pointer approach

    static int sol(int[] heights) {
        int n = heights.length;
        int i = 0, j = n - 1;
        int max = 0;

        while(i < j) {
            int width = j - i;
            int length = Math.min(heights[i], heights[j]);
            int area = width * length;
            max = Math.max(area, max);

            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
