package BinarySearch;

public class MedianOfTwoSorted {

    public static void main(String[] args) {
        int[] arr1 = {1, 5};
        int[] arr2 = {2, 3, 6, 7};

        System.out.println(sol(arr1, arr2));

    }

    public static int sol(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int left = (n1 + n2)/2;
        int lo = 0, hi = Math.min(n1, n2);
        while (lo <= hi) {
            int mid1 = lo + (hi - lo)/2;
            int mid2 = left - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr1[mid2 - 1];
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : arr1[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : arr2[mid2];

            if (l1 > r2) {
                hi = mid1 -1;
            }
            else if (l2 > r1) {
                lo = mid1 + 1;
            }

            return (n1 + n2) % 2 == 0 ? (Math.max(l1, l2) + Math.min(r1,  r2))/2 : Math.min(r1, r2);
        }
        return -1;
    }



    // sorted
    // search median

    // binary search
    // lo = 0, hi = n1

    // mid = lo + hi /2 = 3
    // cut1 = mid
    // cut2 = (n1 + n2)/2 - cut1 ->  2
    // 0 1 2 |3  4  5      -> 1 2 3 5 6 7 8 10 18 20
    // 1 5 8 |10 18 20
    //  2 3 |6 7

    // l1 < r2
    // l2 < r1

    //        |      |
    // 0 3 4 5 5 5 5 5 7 9







}
