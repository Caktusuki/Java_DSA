// 219. Contains Duplicate II
package Leetcode.Easy;

public class Leet_219 {
    // Time Limit Exceeded
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    // 1173ms | Beats 6.39%
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length && j<=i+k ; j++) {  // i-j<= k means j<=i+k
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leet_219 obj = new Leet_219();
        int[] nums = { 1, 2, 3, 1, 2, 3};
        // System.out.println(obj.containsNearbyDuplicate(nums, 3));
        System.out.println(obj.containsNearbyDuplicate2(nums, 2));
    }
}
