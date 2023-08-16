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
        * BINARYSEARCH
        * EQUALS
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

        String[] str = {"messi", "ronaldo", "amitosh", "neymar", "pogba"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        if (Arrays.binarySearch(str, "amitosh") >= 0) {
            System.out.println("found amitosh in the list with goats");
        }

        int[] A1 = {1, 2, 3, 4 ,5};
        int[] A2 = {1, 2, 3, 4 ,5};
        if (Arrays.equals(A1, A2)) {
            System.out.println("both arrays are equal");
        } else {
            System.out.println("they aren't equal");
        }


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
