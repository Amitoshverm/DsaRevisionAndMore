package Arrays;

import java.util.Arrays;

public class SetMatrixZero {

    //Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
    //You must do it in place.
    public static void main(String[] args) {

        int[][] arr = {{1, 1, 0},
                       {1, 1, 1},
                       {2, 3, 5}};
        sol(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    /*  1 2 4 0     0 0 0 0
        3 2 4 5 ->  3 0 4 0
        4 2 1 4     4 0 1 0
        5 0 4 1     0 0 0 0
    */
    /*  1 1 1 0     0 0 0 0
        1 0 1 1 - > 0 0 0 0
        1 1 1 1     1 0 1 0*/

    // bf logic says that create another matrix which is copy of original one and
    // looking at original one if we encounter 0s, we will reflect changes in
    // copy matrix

    // another approach is that if we create two arrays rows and cols which will store
    // if there is 0

    //

    public static void sol(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean row = false, col = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) row = true;
                    if (j == 0) col = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j= 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (col) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
        if (row) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
