// Online Intro class with Anand Sir
package CW.Basics.Day01;

import java.util.Scanner;

public class intro {

    static void Problem1() {
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        int N = 4;
        int currentNumber = 1;
        for (int row = 1; row <= N; row++) {
            for (int count = 1; count <= row; count++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }

    static void Problem2() {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;
        double avg;

        System.out.println("Enter marks of 5 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35) {
            System.out.println("Result: Fail");
        } else {
            avg = (m1 + m2 + m3 + m4 + m5) / 5.0;

            if (avg >= 75) {
                System.out.println("Result: Distinction");
            } else if (avg >= 60) {
                System.out.println("Result: First Class");
            } else {
                System.out.println("Result: Pass");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        // Problem1();
        Problem2();
    }
}
