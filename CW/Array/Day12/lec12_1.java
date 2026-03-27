// 18th February 2026
package CW.Array.Day12;
import java.util.Scanner;
public class lec12_1 {

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printMax(int[] arr) {
        System.out.println("Max: " + max(arr));
    }

    public static void printMin(int[] arr) {
        System.out.println("Min: " + min(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; 
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        printMax(arr);
        printMin(arr);

        sc.close();
    }
}
