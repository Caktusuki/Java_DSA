package basics;

import java.util.Scanner;

public class Lec3 {

    // Main Method: This is the entry point
    public static void main(String[] args) {
   
        checkCollinearity(5, 10, 15, 20, 25, 30);

        System.out.println("Is a line");
        Scanner sc = new Scanner(System.in);
        playLuckyDraw(sc);
        sc.close();
    }
    // FUNCTION 1: Check if 3 points are in a line
    public static void checkCollinearity(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.println("Running Collinearity Check...");
        
        // Note: We cast to (double) to avoid integer division issues
        double m1 = (double)(y2 - y1) / (x2 - x1);
        double m2 = (double)(y3 - y2) / (x3 - x2);

        if (m1 == m2) {
            System.out.println("Result: The points are in a straight line (Collinear).");
        } else {
            System.out.println("Result: The points are NOT in a straight line.");
        }
    }
    // FUNCTION 2: Lucky Draw Game
    public static void playLuckyDraw(Scanner sc) {
        System.out.println("Running Lucky Draw...");
        System.out.print("Enter a number between 0 and 1500: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            sc.next(); 
            return;
        }

        int n = sc.nextInt();

        if (n >= 200 && n <= 280) {
            if (n <= 240)
                System.out.println("Prize: Chilli Kurkure");
            else
                System.out.println("Prize: Onion Kurkure");

        } else if (n >= 300 && n < 460) {
            if (n <= 380)
                System.out.println("Prize: Macbook M1");
            else
                System.out.println("Prize: Macbook M2");

        } else if (n >= 1100 && n <= 1500) {
            if (n <= 1300)
                System.out.println("Prize: Avon Cycle");
            else
                System.out.println("Prize: Hero Cycle");

        } else if (n >= 50 && n <= 80) {
            if (n <= 65)
                System.out.println("Prize: Bullet Bike");
            else
                System.out.println("Prize: Rajdoot Bike");

        } else {
            System.out.println("Better luck next time");
        }
    }
    public static void Apseries() {
        
    }
}