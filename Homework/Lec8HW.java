package homework;

public class Lec8HW {

    // ======= CODING BLOCKS : PATTERN QUESTIONS =================
    //
    // NOTE:
    // Only comments are written.
    // Write your code below each question.
    //
    // ------------------------------------------------------------

    // ================= Page 1 =================

    // Ques 1 (n = 5)
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void p1(int n) {
        System.out.println("Using While Loop : ");
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }

        // System.out.println("Using For Loop : ");
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=n; j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
    }
    // ==========

    // Ques 2 (n = 5)
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void p2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    // Ques 3 (n = 5)
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void p3(int n) {
        for (int i = n; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 4 (n = 5)
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void p4(int n) {
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            space--;

            for (int s = 1; s <= i; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 5 (n = 5)
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // Ques 6 (n = 5)
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void p6(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("   ");
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // ================= Page 3 =================

    // Ques 7 (n = 5)
    // * * * * *
    // * *
    // * *
    // * *
    // * * * * *

    // Ques 8 (n = 5)
    // * *
    // * *
    // *
    // * *
    // * *
    public static void p8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();

        }

    }

    // Ques 9 (n = 5)
    // *
    // * * *
    // * * * * *
    // * * * * * * *
    // * * * * * * * * *

    // ================= Page 4 =================

    // Ques 10 (n = 5)
    // * * * * * * * * *
    // * * * * * * *
    // * * * * *
    // * * *
    // *

    // Ques 11 (n = 5)
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // Ques 12 (n = 5)
    // *
    // * ! *
    // * ! * ! *
    // * ! * ! * ! *
    // * ! * ! * ! * ! *

    // ================= Page 5 =================

    // Ques 13 (n = 5)
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // Ques 14 (n = 5)
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // ================= Page 6 =================

    // Ques 15 (n = 5)
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // Ques 16 (n = 5)
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // Ques 17 (n = 7)
    // * * * * * *
    // * * * *
    // * *
    // * *
    // * * * *
    // * * * * * *

    // ================= Page 7 =================

    // Ques 18 (n = 7)
    // *
    // * * *
    // * * * * *
    // * * * * * * *
    // * * * * *
    // * * *
    // *

    // Ques 19 (n = 7)
    // * * * * * * *
    // * * * * * *
    // * * * *
    // * *
    // * * * *
    // * * * * * *
    // * * * * * * *

    // ================= Page 8 =================

    // Ques 20 (n = 7)
    // *
    // * *
    // * *
    // * *
    // * *
    // * *
    // *

    // Ques 21 (n = 5)
    // * *
    // * * * *
    // * * * * * *
    // * * * * * * * *
    // * * * * * * * * *

    // Ques 22 (n = 5)
    // * * * * * * * * *
    // * * * * * * * *
    // * * * * * *
    // * * * *
    // * *

    // ================= Page 9 (Number Pattern) =================

    // Ques 23 (n = 5)
    // 1
    // 1 1 1
    // 1 1 1 1 1
    // 1 1 1 1 1 1 1
    // 1 1 1 1 1 1 1 1 1

    // Ques 24 (n = 5)
    // 1
    // 2 2 2
    // 3 3 3 3 3
    // 4 4 4 4 4 4 4
    // 5 5 5 5 5 5 5 5 5

    // Ques 25 (n = 5)
    // 1
    // 2 3 4
    // 5 6 7 8 9
    // 10 11 12 13 14 15 16
    // 17 18 19 20 21 22 23 24 25

    // ================= Page 10 =================

    // Ques 26 (n = 5)
    // 1
    // 1 2 3
    // 1 2 3 4 5
    // 1 2 3 4 5 6 7
    // 1 2 3 4 5 6 7 8 9

    // Ques 27 (n = 5)
    // 1
    // 1 2 1
    // 1 2 3 2 1
    // 1 2 3 4 3 2 1
    // 1 2 3 4 5 4 3 2 1

    // Ques 28 (n = 5)
    // 1
    // 2 3 2
    // 3 4 5 4 3
    // 4 5 6 7 6 5 4
    // 5 6 7 8 9 8 7 6 5

    // ================= Page 11 =================

    // Ques 29 (n = 5)
    // 1
    // 2 0 2
    // 3 0 0 0 3
    // 4 0 0 0 0 0 4
    // 5 0 0 0 0 0 0 0 5

    // Ques 30 (n = 5)
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
    public static void p30(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Ques 31 (n = 5)
    // 5 4 3 2 *
    // 5 4 3 * 1
    // 5 4 * 2 1
    // 5 * 3 2 1
    // * 4 3 2 1
    public static void p31(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }
    }

    // ================= Page 12 =================

    // Ques 32 (n = 5)
    // 1
    // 2 * 2
    // 3 * 3 * 3
    // 4 * 4 * 4 * 4
    // 5 * 5 * 5 * 5 * 5
    // 4 * 4 * 4 * 4
    // 3 * 3 * 3
    // 2 * 2
    // 1

    public static void p32(int n) {
        int i = 1;
        int star = 1;
        while (i <= 2 * n - 1) {
            int j = 1;
            // int starsInRow = (2 * i) - 1;

            while (j <= star) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
                j++;
            }

            if (i < n)
                star += 2;

            else
                star -= 2;
            System.out.println();
            i++;
        }
        // while (i <= n - 1) {
        // int j = 1;
        // int starsInRow = (2 * i) - 1;

        // while (j <= starsInRow) {
        // if (j % 2 == 0) {
        // System.out.print("* ");
        // } else {
        // System.out.print(i + " ");
        // }
        // j++;
        // }

        // System.out.println();
        // --i;
        // }

    }

    // Ques 33 (n = 10)
    // 0
    // 9 0 9
    // 8 9 0 9 8
    // 7 8 9 0 9 8 7
    // 6 7 8 9 0 9 8 7 6
    // 5 6 7 8 9 0 9 8 7 6 5
    // 4 5 6 7 8 9 0 9 8 7 6 5 4
    // 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
    // 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
    // 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1

    public static void main(String[] args) {
        // p1(5);
        // p2(5);
        // p3(5);
        // p4(5);
        // p8(5);
        // p6(5);
        // p30(5);
        // p31(5);
        p32(5);
    }

}
