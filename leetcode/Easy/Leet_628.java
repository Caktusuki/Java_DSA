// 628. Maximum Product of Three Numbers
package Leetcode.Easy;

import java.util.Arrays;

public class Leet_628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int p1 = nums[n-1] * nums[n-2] * nums[n-3];
        int p2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(p1, p2);
    }

    public static void main(String[] args) {
        Leet_628 obj = new Leet_628();
        int[] nums = { -100, -98, -1, 2, 3, 4};
        System.out.println(obj.maximumProduct(nums));
    }
}
