// 13th February 2026
package CW.Array.Day10;

import java.util.Scanner;

public class lec10 {
    public static void printArray(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void findElement(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int target = 0;
        System.out.println("Enter 5 integers: ");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Enter the element to be searched: ");
        target = sc.nextInt();
        for(int i=0; i<5; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
        sc.close();
    }

    public static void main(String[] args) {
        // printArray(5);
        findElement();
    }
}
