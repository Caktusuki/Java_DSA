package array;

import java.util.Scanner;

public class Lec11 {
    // temp XOR for swap nos
    public static void swap(int a, int b) {
        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

    public static void revarr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
            i++;
            j--;
        }
        System.out.println("Reversed array is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

    }

    // right shift
    public static void right(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (j > i) {
            arr[i] = arr[i] ^ arr[i + 1];
            arr[i + 1] = arr[i] ^ arr[i + 1];
            arr[i] = arr[i] ^ arr[i + 1];
            i++;
        }
        System.out.println("Right shifted array is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    // Left shift

    public static void left(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (j > i) {
            arr[j] = arr[j] ^ arr[j - 1];
            arr[j - 1] = arr[j] ^ arr[j - 1];
            arr[j] = arr[j] ^ arr[j - 1];

        }
        System.out.println("Right shifted array is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a =sc.nextInt();
        // int b=sc.nextInt();
        // swap(a, b);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // revarr(arr);
        right(arr);
        left(arr);

    }

}
