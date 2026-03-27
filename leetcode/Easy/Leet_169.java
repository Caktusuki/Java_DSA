// 169. Majority Element
package Leetcode.Easy;

public class Leet_169 {
    public static void main(String[] args) {
        Leet_169 obj = new Leet_169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(obj.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        // Brute Force
        int n = nums.length;
        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n/2) {
                return nums[i];
            }
        }
        return -1; 

    }
}
