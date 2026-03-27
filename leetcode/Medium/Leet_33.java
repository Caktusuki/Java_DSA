// 33. Search in Rotated Sorted Array
package Leetcode.Medium;

public class Leet_33 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]){ // left sorted
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            } else { // right sorted
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        Leet_33 obj = new Leet_33();
        System.out.println(obj.search(nums, target));
    }
}
