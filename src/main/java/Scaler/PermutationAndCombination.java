package Scaler;

public class PermutationAndCombination {
    public static void main(String[] args) {

        System.out.println(C(4,3));

    }
    public static int C(int n, int r) {
        if(r == 1) return n;
        if (r <= 0) return 1;

        return C(n-1, r) + C(n-1, r-1);
    }
}
