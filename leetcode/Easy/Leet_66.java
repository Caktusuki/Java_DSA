// 66. Plus One
package Leetcode.Easy;

public class Leet_66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // If we have reached this point, it means all digits were 9
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
            Leet_66 obj = new Leet_66();
            int[] digits = {1, 2, 3};
            int[] result = obj.plusOne(digits);
            for (int num : result) {
                System.out.print(num + " ");
            }
    }
}
