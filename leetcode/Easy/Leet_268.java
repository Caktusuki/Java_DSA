// 268. Missing Number
package Leetcode.Easy;

public class Leet_268 {

    public int missingNumber(int[] nums){
        int n = nums.length;
        int totalSum = n*(n+1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum = actualSum + nums[i];
        }
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        Leet_268 obj = new Leet_268();
        int[] nums = { 3, 0, 1};
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }
}
