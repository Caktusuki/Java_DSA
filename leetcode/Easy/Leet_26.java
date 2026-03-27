// 26. Remove Duplicates from Sorted Array
package Leetcode.Easy;

public class Leet_26 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[count]){
                continue;
            } else {
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Leet_26 obj = new Leet_26();
        System.out.println(obj.removeDuplicates(nums));
    }
}
