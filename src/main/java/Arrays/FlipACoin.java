package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FlipACoin {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> sol(String A) {
        int l = 0, r = 0, currSum = 0, maxSum = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (ch =='1') {
                currSum -= 1;
            }
            else {
                currSum += 1;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                ans.add(l+1);
                ans.add(r+1);
            }
            if (currSum < 0) {
                currSum = 0;
                l = i + 1;
                r = i + 1;
            }
            else {
                r = r + 1;
            }

        }
        if (maxSum == 0) {
            return new ArrayList<>();
        }
        else {
            return ans;
        }
    }
}
