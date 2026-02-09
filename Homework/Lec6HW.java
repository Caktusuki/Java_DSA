public class Lec6HW {

    // --- Pattern 1: Prints 'x' ---
    public static void pattern1() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print 'x '
            for (int k = 1; k <= i; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    // --- Pattern 2: Prints Row Numbers (1, 2 2, 3 3 3) ---
    public static void pattern2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print Row Number 'i'
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    } // <--- ADDED CLOSING BRACE HERE

    // --- Pattern 3: Prints Column Numbers (1, 1 2, 1 2 3) ---
    public static void pattern3() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print Column Number 'k'
            for (int k = 1; k <= i; k++) {
                
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    // --- Main Method (Must be inside the class) ---
    public static void main(String[] args) {
        // Uncomment the pattern you want to run
        pattern1();
        System.out.println(); // Space between patterns
        pattern2();
        System.out.println();
        pattern3();
    }
}