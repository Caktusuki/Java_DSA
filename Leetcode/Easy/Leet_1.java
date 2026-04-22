// 1. Two Sum
package Leetcode.Easy;

public class Leet_1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    int result[] = { i, j };
                    return result;
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Leet_1 obj = new Leet_1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);
    }
}
