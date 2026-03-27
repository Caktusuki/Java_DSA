// 6th March 2026
package CW.Array.Day21;

import java.util.Scanner;

public class Lec_21_2 {
    public static void squareOfArray(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int[] squareArr = new int[n];
            for(int i=0; i<n; i++){
                squareArr[i] = arr[i] * arr[i];
            }
            for(int i=0; i<n; i++){
                System.out.print(squareArr[i] + " ");
            }
            sc.close();
        
    }
    public static void main(String[] args) {
        squareOfArray();
    }
}
