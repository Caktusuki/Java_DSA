// 724. Find Pivot Index
package Leetcode.Easy;

public class Leet_724 {
    public static void main(String[] args) {
        Leet_724 leet = new Leet_724();
        int[] nums = {1,7,3,6,5,6};
        int result = leet.pivotIndex(nums);
        System.out.println(result);
    }

    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        for (int i=0; i<n; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
