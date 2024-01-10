package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(primesum(26)));


    }

public static int solve(int[] A) {
    int ans = 0;
    for (int i = 0; i < A.length; i++) {
        int c = 0;
        if (isPrime(A[i])) {
            c++;
            ans += c;
        }
        else{
            continue;
        }
    }
    return ans;
}
    public static int[] primesum(int A) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= A; i++) {
            if (isPrime(i)) {
                arr.add(i);
            }
        }
        int[] ans = new int[2];
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) + arr.get(j) == A) {
                ans[0] = arr.get(i);
                ans[1] = arr.get(j);
                break;
            } else if (arr.get(i) + arr.get(j) > A) {
                j--;
            } else {
                i++;
            }
        }
        return ans;

    }
    public static boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


