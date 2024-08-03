package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class rough {
    public static void main(String[] args) {



//        int [] arr = {3, 0, 2, 0, 4};
//        System.out.println(rainWaterTrap(arr));

//        int[] arr = {1,-1, 2, 3, 4};
//        int ans = Integer.MIN_VALUE;
//        int c = 1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i-1]+1) {
//                c++;
//            }
//            else {
//                c = 1;
//            }
//            ans = Math.max(ans, c);
//
//        }
//        System.out.println(ans);

//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//
//        while (t > 0) {
//            int n = in.nextInt();
//            if ((n & 1) == 0) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//            t--;
//        }


//        int a = 1;
//        int b = a;
//        a = a++ +b;
//        System.out.println(a);
//        System.out.println(b);
//        String a = "abb";
//        String b = "bab";
//        if (a == b) {
//            System.out.println(true);
//        }
//        else
//            System.out.println(false);

//        HashMap<Character, Integer> map = new HashMap<>();
//        String A = "uucgncntt";
//        HashSet<Character> set = new HashSet<>();
//        for (int i = 0; i < A.length(); i++) {
//            set.add(A.charAt(i));
//        }
//        for (int i = 0; i < A.length(); i++) {
//            if (map.containsKey(A.charAt(i))) {
//                map.put(A.charAt(i), map.get(A.charAt(i))+1);
//            }
//            else {
//                map.put(A.charAt(i), 1);
//            }
//        }
//        int c = 0;
//        for (Integer val : map.values()) {
//            if (val % 2 == 0) {
//                c++;
//            }
//        }
//        if (c == set.size()) {
//            System.out.println(1);
//        }else {
//            System.out.println(0);
//        }
        HashSet<Integer> set = new HashSet<>();

    }
    public static ArrayList<Integer> sol(int [] A) {
        int max = A[A.length - 1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(A[A.length-1]);
        for (int i = A.length - 2; i >= 0; i--) {
            if (max <= A[i]) {
                ans.add(A[i]);
                max = A[i];
            }
        }
         swap(ans, 0, ans.size()-1);
        return ans;
    }
    public static void swap(ArrayList<Integer> A, int l, int r) {
        while (l < r) {
            int temp = A.get(l);
            A.set(l, A.get(r));
            A.set(r, temp);
            l++;
            r--;
        }
    }
    public static int rainWaterTrap(int[] arr) {
        int ans = 0;
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];

        int max = 0;
        for (int i = 0 ; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            leftMax[i] = max;
        }
        int rmax = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            rmax = Math.max(arr[i], rmax);
            rightMax[i] = rmax;
        }
        for (int i = 0; i < arr.length; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - arr[i];

        }
        return ans;
    }

    static ArrayList<Integer> sol(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        return null;
    }
    public static int solve(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if (map.containsKey(A.charAt(i))) {
                map.put(A.charAt(i), map.get(A.charAt(i)) + 1);
            } else {
                map.put(A.charAt(i), 1);
            }
        }
        int c = 0;
        for (Integer val : map.values()) {
            if (val % 2 == 0) {
                c++;
            }
        }

        return 1;
    }
//    static int sol1(int[] arr, int k) {
//        int n = arr.length;
//        int c = 0;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            if (arr[i] == k) {
//                c++;
//            }
//            for (int j = i; j < n; j++) {
//                sum = arr[i]+arr[j];
//                if (sum == k) {
//                    c++;
//                }
//            }
//        }
//        return c;
//    }
}
