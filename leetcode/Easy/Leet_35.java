// 35. Search Insert Position
package Leetcode.Easy;

public class Leet_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2; // find middle
            if (nums[mid] == target) {
                return mid; // target found
            }
            if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return left;
    }
    public static void main(String[] args) {
            Leet_35 obj = new Leet_35();
            int[] nums = {1,3,5,6};
            int target = 5;
            System.out.println(obj.searchInsert(nums, target));
    }
}
