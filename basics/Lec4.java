package basics;

import java.util.Scanner;

public class Lec4 {

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void pattern1() {
        // for (int i = 1; i <= 5; i++) {
        // // Star
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int n = 5;
        int row = 1;
        while (row <= n) {
            // star
            int i = 1;
            while (i <= n) {
                System.out.print("*  ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void pattern2() {
        int n = 5;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int row = n;
        while (row >= 1) {
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void pattern4() {
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
            star++;
        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int star = n;
        int row = 1;
        // while (row <= n) {
        // // space
        // int i = 1;
        // while (i <= space) {
        // System.out.print(" ");
        // i++;
        // }
        // // star
        // int j = 1;
        // while (j <= star) {
        // System.out.print("* ");
        // j++;
        // }
        // System.out.println();
        // row++;
        // space++;
        // star--;
        // }

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
            star--;
        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern6() {
        for (int i = 5; i >= 1; i--) {
            for (int k = 5; k > i; k--) {
                System.out.print("  ");
            }
            for (int l = 5; l > i; l--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // * * * * *
    // * *
    // * *
    // * * * * *
    public static void pattern7() {
        int rows = 4;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        pattern6();
        // pattern7();
    }
}