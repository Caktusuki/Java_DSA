// 12th February 2026
package CW.Basics.Day09;

public class lec9 {

    public static void evenOdd1(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static int evenOdd2(int n){
        if (n % 2 == 0) {
            return 1; 
        } else {
            return 0;
        }
    }

    public static void max1(int a, int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static int max2(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        return 0;
    }

    public static void maxThree1(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static int maxThree2(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void sumN1(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static int sumN2(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static void simpleInterest1(int p, int r, int t){
        double si = (p * r * t) / 100.0;
        System.out.println(si);
    }

    public static int simpleInterest2(int p, int r, int t){
        return (p * r * t) / 100;
    }

    public static void reverseNumber1(int n){
        int reverse = 0;
        while(n > 0){
            int r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        System.out.println(reverse);
    }

    public static int reverseNumber2(int n){
        int reverse = 0;
        while(n > 0){
            int r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        return reverse;
    }

    public static void allEve1(int n2){
        for(int i=1; i<=n2; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static int allEve2(int i) {
        if(i % 2 == 0){
            return i;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {      
        int n = 10;

        evenOdd1(n); 
        int result = evenOdd2(n);
        if (result == 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int a = 5, b = 10;
        max1(a, b);
        max2(a, b);

        int c = 15;
        maxThree1(a, b, c);

        int max = maxThree2(a, b, c);
        System.out.println(max);

        sumN1(n);

        int sum = sumN2(n);
        System.out.println(sum);

        int p = 1000, r = 5, t = 2;
        simpleInterest1(p, r, t);

        int si = simpleInterest2(p, r, t);
        System.out.println(si);

        int number = 12345;
        reverseNumber1(number);

        int reversed = reverseNumber2(number);
        System.out.println(reversed);

        int n2 = 1000;
        // allEve1(n2);

        for(int i=1; i<=n2; i++){
            int even = allEve2(i);
            if(even != -1){
                System.out.print(even + " ");
            }
        }
        
    }
}
