package array;

import java.util.Scanner;

//Java array 
public class Lec10 {
    public static void arrayf(int n) {
        int[] arr = new int[n];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void arrfind(int n) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[n];
            System.out.println("Enter the element to be found");
            int t = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the element at index " + i);
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == t) {
                    System.out.println("Found at index " + j);
                    return;
                }
            }
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        // arrayf(5);
        arrfind(5);

    }
}