package FunWJava;

import java.util.Arrays;

public class Two_D_Arrays {
    public static void main(String[] args) {
        int[][] arr ={{1, 2, 4},
                      {6, 1, 3},
                      {11, 3, 2}};
        int[][] A = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                A[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] +" ");
            }
            System.out.println();
        }
    }
}
