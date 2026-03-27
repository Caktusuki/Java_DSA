// 53. Maximum Subarray
package Leetcode.Medium;

public class Leet_53 {
    public int maxSubArray1(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (ans < sum) {
                    ans = sum;
                }
            }
        }
        return ans;
    }

    public static int maxSubArray2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        int maxSum = maxSubArray2(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
