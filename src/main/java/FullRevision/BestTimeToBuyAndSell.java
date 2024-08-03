package FullRevision;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] dates = {7, 2, 1, 5, 6, 4, 3};
        System.out.println(profitOnBuy(dates));
        System.out.println(profit(dates));
    }

    static int profitOnBuy(int[] A) {
        int cost_price = A[0];
        int profit = 0;
        for (int i = 1; i < A.length; i++) {
            int sell_price = A[i];
            if (sell_price > cost_price) {
                profit = Math.max(profit, sell_price - cost_price);
            }else {
                cost_price = sell_price;
            }
        }
        return profit;
    }


    /*  [ 7, 2, 1, 5, 6, 4, 3]

       7  2  1  5  6  4  3

    7  0 -5 -6 -2 -1 -3 -4
    2
    1           4  5  3  2
    5              1  0  0
    6                 0  0
    4                    0
    3                    0

    /
     */

//    another approach is using kadanes
    public static int profit(int[] arr) {
        int max_so_far = 0;
        int max_ends_here = 0;
        for (int i = 1; i < arr.length; i++) {
            max_ends_here += arr[i] - arr[i-1];

            if (max_ends_here < 0) {
                max_ends_here = 0;
            }
            if (max_ends_here > max_so_far) {
                max_so_far = max_ends_here;
            }

        }
        return max_so_far;

    }
}
