package Arrays;

import java.util.ArrayList;

public class AddOneToNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        int m = 0;
        int n = arr.length-1;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            m += (int)(arr[i] * Math.pow(10, n));
            n--;
        }
        m = m + 1;
        int newn = arr.length -1;
        while (m > 1) {
            int rem = (int) (m / Math.pow(10, newn));
            ans.add(rem);
            m = (int) (m % Math.pow(10, newn));
            m = m/10;
            newn--;
        }

    }
}
