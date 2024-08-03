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


        //System.out.println(spiralOrder(arr));
        System.out.println(spirallyTraverse(arr, 3, 4));


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
    static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int maxc = c-1, minc = 0;
        int maxr = r-1, minr = 0;
        int count = r*c;
        while (count > 0) {
            //top
            for (int i = minc; i <= maxc && c > 0; i++) {
                ans.add(matrix[minr][i]);
                count--;
            }

            //right
            minr++;
            for (int i = minr; i <= maxr && count > 0; i++) {
                ans.add(matrix[i][maxc]);
                count--;
            }

            //bottom
            maxc--;
            for (int i = maxc; i >= minc && count > 0; i--) {
                ans.add(matrix[maxr][i]);
                count--;
            }

            //left
            maxr--;
            for (int i = maxr; i>= minr && count > 0; i--) {
                ans.add(matrix[i][minc]);
            }
            minc++;
        }
        return ans;
    }
}

