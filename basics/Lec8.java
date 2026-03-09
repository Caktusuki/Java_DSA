package basics;

import java.util.Scanner;

public class Lec8 {
    public static void Prime() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);

    }

    public static void Primein() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
    public static void Fibonacci(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for (int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void HCF(){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a%b !=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        System.out.println(b);
    }
    public static void Reverse(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d= n%10;
        int rev=0;
        while (n>0){
            rev=rev*10+d;
            n=n/10;
            d=n%10;
        }

    


    }
    public static void main(String[] args) {
        // Prime();
        //Primein();
       // Fibonacci();
          HCF();
    }

}
