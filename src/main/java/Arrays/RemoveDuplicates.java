package Arrays;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(sol(arr));
    }
    public static int sol(int[] arr) {
        int n = arr.length;
        int ptr = 1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[ptr] = arr[i+1];
                ptr++;
            }
        }
        return ptr;
    }
}
