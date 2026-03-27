// 4th February 2026
package CW.Basics.Day03;

import java.util.Scanner;

public class lec3 {
    public static void isLinear() {
        int x1 = 2;
        int y1 = 3;

        int x2 = 4;
        int y2 = 5;

        int x3 = 6;
        int y3 = 7;

        int m1 = (y2 - y1) / (x2 - x1);
        int m2 = (y3 - y2) / (x3 - x2);

        if (m1 == m2) {
            System.out.println("The points are collinear");
        } else {
            System.out.println("The points are not collinear");
        }
    }

    public static void lotteryGame(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 400;
        if(n >=300 && n <= 460){
            System.out.println("Price : Mackbook");
        } else if(n >= 200 && n <=280){
            System.out.println("Price kurkure");
        } else if(n >= 1100 && n <=1500 ){
            System.out.println("Price : Cycle");
        } else if( n > 50 && n <= 80){
            System.out.println("Price: Bike");
        } else{
            System.out.println("Better Luck Next Time");
        }
        sc.close();
    }

    public static void lotteryGameAdvanace() {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 400;
        if (n >= 300 && n <= 460) {
            System.out.println("Price : Mackbook");
            if(n >=300 &&  n <=380){
                System.out.println("M1 Model");
            }else if(n >= 381 && n < 460){
                System.out.println("M2 Model");
            }
        } else if (n >= 200 && n <= 280) {
            System.out.println("Price kurkure");
            if (n >= 200 && n <= 240) {
                System.out.println("Chili Kurkure");
            } else if (n >= 241 && n < 280) {
                System.out.println("Onion Kurkure");
            }
        } else if (n >= 1100 && n <= 1500) {
            System.out.println("Price : Cycle");
            if (n >= 1100 && n <= 1300) {
                System.out.println("Avon Cycle");
            } else if (n >= 1301 && n < 1500) {
                System.out.println("Hero Cycle");
            }
        } else if (n > 50 && n <= 80) {
            System.out.println("Price: Bike");
            if (n > 50 && n <= 65) {
                System.out.println("Bullet");
            } else if (n >= 65 && n < 80) {
                System.out.println("Rajdoot");
            }
        } else {
            System.out.println("Better Luck Next Time");
        }
        sc.close();
    }

    public static void APSeries(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = 2;
        for(int i=1; i<=a; i++){
            System.out.println(1 +(i-1)*d ); // formula
        }
        sc.close();
    }

    public static void main(String[] args) {
        // isLinear();
        // lotteryGame();
        // lotteryGameAdvanace();
        APSeries();
    }
}
