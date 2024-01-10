package Scaler;

import java.util.Arrays;

public class SieveOfEratosthenes {


    public static void main(String[] args) {
//        System.out.println(Arrays.toString(spf(24)));
//        System.out.println(spf(19));
        int[] arr = new int[10+1];
//        for (int i = 1; i < arr.length; i++) {
//        }
        int n = (int)Math.sqrt(16);
        System.out.println(n);
    }

//    public static int divisors(int n) {
//        int[] arr = spf(n);
//        int ans = 1;
//        while (n > 1) {
//            int x = arr[n];
//            int c = 0;
//            while (n % x == 0) {
//                n = n/x;
//                c++;
//            }
//            ans = ans * (c+1);
//        }
//        return ans;
//    }
    public static void sol(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j = j+i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i+" ");
            }
        }
    }

    public static int spf(int n) {
        int[] sieve = new int[n+1];

        for (int i = 2; i <= n; i++) {
            sieve[i] = i;
        }
        for (int i = 2; i*i <= n; i++) {

                for (int j = i*i; j <= n; j =j+i) {
                    if (sieve[j] == j) {
                        return i;

                    }
                }
            }

        return 0;

    }
}
