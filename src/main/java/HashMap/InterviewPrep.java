package HashMap;

public class InterviewPrep {
    public static void main(String[] args) {
        //printStarLeftToRight(5);
//        printStrRightToLeft(5);
//        RightSidedTriangle(5);
//        hillPattern(5);
//        reverseHillPattern(5);
//        diamond(5);

        infiniteSign(4);
    }

    public static void printStarLeftToRight (int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printStrRightToLeft(int n) {
        for (int i  = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }


            System.out.println();
        }
    }

    public static void RightSidedTriangle(int n) {
        /*


        * * * * *
          * * * *
            * * *
              * *
                *

         */
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }

                for (int j = i; j<= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

    public static void hillPattern(int n) {
        /*
            *
          * * *
         * * * *
        * * * * *
       * * * * * *
         */

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseHillPattern(int n) {

        /*
           * * * * * * * * *
            * * * * * * * *
             * * * * * * *
              * * * * * *
               * * * * *
                * * * *
                 * * *
                   *

         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n-1; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        /*

          *
        * * *
       * * * *
      * * * * *
     * * * * * *
       * * * *
        * * *
         * *
          *

         */
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j<= n-1; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void infiniteSign(int n) {

        /*
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
         */

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}







/*
    *                       *                       *
  * * *   ->              * *           &           * *
 * * * *                * * *                       * * *
* * * * *             * * * *                       * * * *

/
 */
