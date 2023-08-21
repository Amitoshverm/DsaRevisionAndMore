package FunWJava;

public class Two_D_Arrays {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 3},
                      {4, 2, 6},
                      {9, 10 ,8}};

        int i = 0, j = arr.length-1;
        while (i < arr.length) {
            if (i + j == arr.length-1) {
                System.out.println(arr[i][j]);
            }
            i++;
            j--;
        }
    }
}
