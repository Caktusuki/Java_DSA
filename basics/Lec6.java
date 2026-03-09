package basics;

public class Lec6 {

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern1() {
        int n = 5;

        System.out.println("Using For Loop : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Using While Loop : ");
        int row = 1;
        while (row <= 2 * n - 1) {
            int star = 1;
            if (row <= n) {
                while (star <= row) {
                    System.out.print(" * ");
                    star++;
                }
            } else {
                while (star <= 2 * n - row) {
                    System.out.print(" * ");
                    star++;
                }
            }
            System.out.println();
            row++;
        }
    }

    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void pattern2() {
        int n = 5;

        System.out.println("Using For Loop : ");

        System.out.println("Using While Loop : ");
        int space = n - 1;
        int star = 1;
        int row = 1;

        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("   ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(" * ");
                j++;
            }
            if (row < n) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }
            row++;
            System.out.println();
        }
    }

    //         * * * * *
    //       * * * *
    //     * * *
    //   * *
    // *
    //   * *
    //     * * *
    //       * * *
    //         * * * * *
    public static void pattern3() {
        int n = 5;

        System.out.println("Using For Loop : ");

        System.out.println("Using While Loop : ");
        int row = 1;
        int space = n - 1;
        int star = n;
        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            if (row < n) {
                space--;
                star--;
            } else {
                space++;
                star++;
            }
            row++;
        }
    }

    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *
    //
    // *             *
    // * *         * *
    // * * *     * * *
    // * * * * * * * *
    public static void pattern4() {
        int n = 5;

        System.out.println("Using For Loop : ");

        System.out.println("Using While Loop : ");
        int row = 1;
        int star = n - 1;
        int space = 1;
        while (row <= 2 * n - 1) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            // star
            i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            if (row < n) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        pattern4();
    }
}