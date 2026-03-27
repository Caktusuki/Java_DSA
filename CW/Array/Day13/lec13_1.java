// 19th February 2026
package CW.Array.Day13;
import java.util.Scanner;

public class lec13_1 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0)
            return;
        k = k % n; // Handle k > n
        reverse(nums, 0, n - 1); // Reverse whole array
        reverse(nums, 0, k - 1); // Reverse first k elements
        reverse(nums, k, n - 1); // Reverse remaining elements
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void leet189() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        leet189();
    }
}