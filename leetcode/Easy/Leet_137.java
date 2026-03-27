// 137. Single Number II
package Leetcode.Easy;

import java.util.Arrays;

public class Leet_137 {
    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length-1){
            if(nums[i] == nums[i+1]){
                i+=3;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        Leet_137 obj = new Leet_137();
        int[] nums = { 2, 2, 3, 2};
        System.out.println(obj.singleNumber1(nums));
    }
}
