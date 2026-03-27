// 6th March 2026
package CW.Array.Day21;

import java.util.Scanner;
public class Lec_21_1 {
    public static void arraySum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] j = new int[n];
        j[0] = arr[0];
        for(int i=1; i<n; i++){
            j[i] = j[i-1] + arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(j[i] + " ");
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        arraySum();
    }
}
