// 896. Monotonic Array
package Leetcode.Easy;

public class Leet_896 {

    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }
        
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        Leet_896 obj = new Leet_896();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {4, 3, 2, 1};
        int[] nums3 = {1, 3, 2, 4};

        System.out.println(obj.isMonotonic(nums1)); // Output: true
        System.out.println(obj.isMonotonic(nums2)); // Output: true
        System.out.println(obj.isMonotonic(nums3)); // Output: false
    }
}
