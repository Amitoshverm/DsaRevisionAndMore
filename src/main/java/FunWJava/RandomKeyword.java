package FunWJava;

import java.util.Arrays;
import java.util.Random;

public class RandomKeyword {
    public static void main(String[] args) {

        /*  FUNCTIONS ON UTIL.ARRAYS
        * SORT
        * RANDOM
        * COPYOF
        * FILL
        *
        * */

        int[] arr = RandomArray(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[10];
        Arrays.fill(arr2, (23 + 9));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = RandomArray(9);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr3, 9);
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = Arrays.copyOf(arr4, 5);
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = Arrays.copyOf(arr5, 10);
        System.out.println(Arrays.toString(arr6));
    }
    static int[] RandomArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        return arr;
    }
}
