package Scaler;
import java.util.*;
public class hashing {
    public static void main(String[] args) {
        String str = "abcdefgh";
        String t = "cdef";
        int n = t.length();
        System.out.println(str.substring(0, 4));
        ArrayList<Integer> arr = new ArrayList<>();
    }

    public static int shaggyDistances(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                ans = Math.min(ans, i - hm.get(arr[i]));
            }

                hm.put(arr[i], i);

        }
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        return ans;
//        int ans = Integer.MAX_VALUE;
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for(int i = 0; i < arr.length; i++) {
//            if(hm.containsKey(arr[i])) {
//                ans = Math.min(ans, i - hm.get(arr[i]));
//            }
//            hm.put(arr[i], i);
//        }
//        if (ans == Integer.MAX_VALUE ){
//            return -1;
//        }
//        return ans;
    }

    public static int longestSubArraySum(int[] arr) {
        //Create prefix sum array
        // we will use this prefix array in our hashmap and make this a variety of shaggy distances i.e. farthest
        //distances
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
            if (hm.containsKey(arr[i])) {
                ans = Math.max(ans, i - hm.get(arr[i]));
            }
            hm.put(arr[i], i);
        }
        return ans;
    }

    public static void triangle(int[] A, int [] B) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            hm1.put(A[i], hm1.getOrDefault(A[i], 0)+1);
        }
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            if (hm2.containsKey(B[i])) {
                hm2.put(B[i], hm2.get(B[i])+1);
            }
            else
            {
                hm2.put(B[i], 1);
            }
        }
    }
}


