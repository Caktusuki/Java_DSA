// 217. Contains Duplicate
package Leetcode.Easy;

import java.util.Arrays;

public class Leet_217 {
    // Time Limit Exceeded
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // 25ms | Beats 13.52% 
    public boolean containsDuplicate2(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            Leet_217 obj = new Leet_217();
            int nums[] = {1,2,3,1};
            // System.out.println(obj.containsDuplicate(nums));
            System.out.println(obj.containsDuplicate2(nums));
    }
}
