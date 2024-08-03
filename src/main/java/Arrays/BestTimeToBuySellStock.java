package Arrays;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {

    }

    static int sol (int[] arr) {
        int profit = 0;
        int buy_price = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int sell_price = arr[i];
            //neglecting if the cost price is greater than selling price
            if (sell_price > buy_price) {
                profit = Math.max(profit, sell_price - buy_price);
            }
            else {
                buy_price = sell_price;
            }
        }
        return profit;
    }
}
// the bf logic which is coming in my mid is the n^2
//
/*   7  1  5  3  6  4

7    0 -6 -2 -4 -1 -3
1    0  0  4  2  5  3
5    0  0  0 -2  1 -1
3    0  0  0  0  3  1
6    0  0  0  0  0  2
4    0  0  0  0  0  0

/
 */
