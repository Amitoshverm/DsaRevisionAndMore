package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DailyTemperatures {
    public static void main(String[] args) {

        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = j - i;
                    break;
                }else{
                    ans[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
