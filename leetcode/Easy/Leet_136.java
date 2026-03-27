// 136. Single Number
package Leetcode.Easy;

import java.util.Arrays;

public class Leet_136 {
    // using XOR operator
    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int i = 0;
        for(i=0; i<nums.length-1; i+=2){
            int temp = nums[i] ^ nums[i+1];
            if(temp != 0){
                result = nums[i];
                break;
            }
        }
        return result;
    }

    // using brute force approach
    public int singleNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    // Optimized
    public int singleNumber3(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        Leet_136 obj = new Leet_136();
        int[] nums = {2, 2, 1, 4, 4};
        System.out.println(obj.singleNumber1(nums));
    }
}
