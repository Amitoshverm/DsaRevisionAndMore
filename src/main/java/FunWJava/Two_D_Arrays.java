package FunWJava;

public class Two_D_Arrays {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 3, 9},
                      {4, 2, 6, 22},
                      {9, 10 ,8, 11},
                      {2, 4, 6, 12}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
                if (i + j == arr.length-1) {
                    System.out.print(arr[i][j]+ " ");
                }
            }

        }
    }
}
