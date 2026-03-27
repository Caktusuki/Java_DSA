// 1009. Complement of Base 10 Integer
package Leetcode.Easy;

public class Leet_1009 {

    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int mask = 1; 
        while (mask < n) { 
            mask = mask * 2 + 1;          // 1, 3, 7, 15,..
        }
        return n ^ mask; 
    }


    public static void main(String[] args) {
        Leet_1009 obj = new Leet_1009();
        System.out.println(obj.bitwiseComplement(5)); // Output: 2
        System.out.println(obj.bitwiseComplement(7)); // Output: 0
        System.out.println(obj.bitwiseComplement(10)); // Output: 5

    }
}
