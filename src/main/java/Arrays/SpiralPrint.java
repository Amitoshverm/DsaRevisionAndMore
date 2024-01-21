package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralPrint {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3, 11},
                        {4, 5, 6, 12},
                        {7, 8, 9, 13}
        };


        System.out.println(spiralOrder(arr));

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int totalElements = matrix.length * matrix[0].length;
        int minRow = 0, maxRow = matrix.length - 1;
        int minCol = 0, maxCol = matrix[0].length - 1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (totalElements > 0) {

            // top
            for (int i = minCol; i <= maxCol && totalElements > 0; i++) {
                ans.add(matrix[minRow][i]);
                totalElements--;
            }
            minRow++;

            //right
            for (int i = minRow; i <= maxRow && totalElements > 0; i++) {
                ans.add(matrix[i][maxCol]);
                totalElements--;
            }
            maxCol--;

            //bottom
            for (int i = maxCol; i >= minCol && totalElements > 0; i--) {
                ans.add(matrix[maxRow][i]);
                totalElements--;
            }
            maxRow--;

            //left
            for (int i = maxRow; i >= minRow && totalElements > 0; i--) {
                ans.add(matrix[i][minCol]);
                totalElements--;
            }
            minCol++;
        }
        return ans;
    }
}
