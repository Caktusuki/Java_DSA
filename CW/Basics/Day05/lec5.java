// 6th February 2026
package CW.Basics.Day05;
import java.util.Scanner;

public class lec5 {

    //         * 
    //       * * *
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * *
    public static void pattern1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
        sc.close();
    }

    // * * * * * * * * * 
    //   * * * * * * *
    //     * * * * *
    //       * * *
    //         *
    public static void pattern2() {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int space = 0;
        int star = 2 * n - 1;
        int row = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            space++;
            star = star - 2;
        }
    }

    //         * 
    //       *   *
    //     *   *   *
    //   *   *   *   *
    // *   *   *   *   *
    public static void pattern3(){
        int n = 5;
        int space = n - 1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                if (j % 2 == 1) {
                    System.out.print("* ");
                    j++;
                } else {
                    System.out.print("  ");
                    j++;
                }
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    //         * 
    //       * ! *
    //     * ! * ! *
    //   * ! * ! * ! *
    // * ! * ! * ! * ! *
    public static void pattern4(){
        int n = 5;
        int space = n - 1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                if (j % 2 == 1) {
                    System.out.print("* ");
                    j++;
                } else {
                    System.out.print("! ");
                    j++;
                }
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    //  *                       * 
    //  *  *                 *  *
    //  *  *  *           *  *  *
    //  *  *  *  *     *  *  *  *
    //  *  *  *  *  *  *  *  *  *  *
    public static void pattern5(){
        int n = 5;
        int row = 1;
        int star = 1;
        int space = 2 * n - 3;
        while (row <= n) {
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(" * ");
                j++;
            }
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("   ");
                i++;
            }
            // star
            j = 1;
            while (j <= star) {
                System.out.print(" * ");
                j++;
            }
            //next line update
            System.out.println();
            space = space - 2;
            row++;
            star++;
        }
    }

    // *                 * 
    // * *             * *
    // * * *         * * *
    // * * * *     * * * *
    // * * * * * * * * * *
    public static void pattern6(){
        int n = 5;
        int row = 1;
        while (row <= n) {
            int left = 1;
            while (left <= row) {
                System.out.print("* ");
                left++;
            }
            int space = 1;
            while (space <= (n - row) * 4) {
                System.out.print(" ");
                space++;
            }
            int right = 1;
            while (right <= row) {
                System.out.print("* ");
                right++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        pattern6();
    }
}