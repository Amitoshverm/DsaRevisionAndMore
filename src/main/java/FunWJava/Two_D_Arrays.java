package FunWJava;

import java.util.Arrays;
import java.util.HashSet;

public class Two_D_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 2, 2, 2};
        HashSet<Integer> hs = new HashSet<>();
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i])) {
                c++;
                hs.remove(arr[i]);
            }
            else {
                hs.add(arr[i]);
            }
        }
        System.out.println(c);
    }

}
