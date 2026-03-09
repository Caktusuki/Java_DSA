package basics;

public class Lec9 {
    // void function
    public static void vadd(int a, int b) {
        int s = a + b;
        System.out.println(s);
    }

    // return type function
    public static int radd(int a, int b) {
        int s = a + b;
        return s;
    }
    // void even

    public static void veven(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
    // return evn

    public static boolean reven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // void mx
    public static void vmax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // return mx
    public static int rmax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // void mx for three
    public static void vmaxT(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is the Greatest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the Greatest");
        } else {
            System.out.println(c + " is the Greatest");
        }
    }

    // return type mx for three
    public static int rmaxT(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // void sum of n natural nos
    public static void vsumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // sum of n natural nos (return type)
    public static int rsumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // void simple interest
    public static void vsi(int p, int r, int t) {
        int si = (p * r * t) / 100;
        System.out.println(si);
    }

    // return type simple interest*
    public static int rsi(int p, int r, int t) {
        int si = (p * r * t) / 100;
        return si;
    }

    // reverse the number void
    public static void vreverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }

    // reverse the number return type
    public static int rreverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void vevento(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int revento(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // vadd(10, 20);
        // System.out.println(radd(20, 30));
        // veven(10);
        // System.out.println(reven(11));
        // vmax(10, 20);
        // System.out.println(rmax(10, 20));
        // vmaxT(10, 20, 30);
        // System.out.println(rmaxT(10, 20, 30));
        // vsumN(5);
        // System.out.println(rsumN(5));
        // vsi(1000, 5, 2);
        // System.out.println(rsi(1000, 5, 2));
        // vreverse(123);
        // System.out.println(rreverse(123));
        vevento(10);
        for (int i = 1; i <= 10; i++) {
            System.out.println(revento(10));
        }

    }
}
