package Scaler;

import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
       String st = "1234";
       char[] ch = st.toCharArray();
        System.out.println(ch[3]);
    }
    static int ans(int[] arr , int target) {
        int i = 0, j = 1;
        int c = 0;
        int temp = 0;
        while (j < arr.length) {
            if (arr[j] - arr[i] == target && arr[j] != temp) {
                c++;
                temp = arr[j];
                i++;
                j++;
            }
            else if(arr[j] - arr[i] < target) {
                j++;
            }
            else  {
                i++;
                if(i == j) {
                    j++;
                }
            }
        }
        return c;
    }


}
