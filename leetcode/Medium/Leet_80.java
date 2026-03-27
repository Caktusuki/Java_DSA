// 80. Remove Duplicates from Sorted Array II
package Leetcode.Medium;

public class Leet_80 {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i=2; i<nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,3,3,3,4};
        Leet_80 obj = new Leet_80();
        System.out.println(obj.removeDuplicates(nums));
    }
}
