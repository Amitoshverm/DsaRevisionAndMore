package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int [] arr = {5, 8, 10, 14, 18, 23, -15, -9, -6, 1, 2};
        System.out.println(bs(arr, -15));


    }
    public static int bs(int[] A, int B){
        if (A[0] == B) {
            return 0;
        }
        int n = A.length;
        int l = 0, r = n-1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (A[mid] == B) {
                 return mid;
            }
            // left side
            else if (A[0] <= A[mid]) {
                if (A[0] < B && A[mid] >= B) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }

            //right side
            else {
                if (A[mid] < B && A[n-1] >= B) {
                    l = mid + 1;
                }
                else {
                    r = mid -1;
                }
            }

        }
        return  -1;
    }

}
