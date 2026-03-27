// 162. Find Peak Element
package Leetcode.Medium;

public class Leet_162 {
    
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Leet_162 obj = new Leet_162();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.findPeakElement(nums));
    }
}
