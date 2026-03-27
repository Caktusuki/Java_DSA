// 18th February 2026
package CW.Array.Day12;
import java.util.Scanner;
public class lec12_2 {
    
    public static void swaptemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void swapwithouttemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void swapXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swaptemp(a, b);
        swapwithouttemp(a, b);
        swapXOR(a, b);
        sc.close();
    }
}
