// 231. Power of Two
package Leetcode.Easy;

public class Leet_231 {
    public static void main(String[] args) {
        Leet_231 obj = new Leet_231();
        System.out.println(obj.isPowerOfTwo(16));
    }
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) { // Check if n is divisible by 2
            n = n / 2; // Divide n by 2
        }
        return n == 1;
    }
}
