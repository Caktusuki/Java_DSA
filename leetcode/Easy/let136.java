package leetcode.Easy;

import java.util.Arrays;

public class let136 {

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i += 3) {

            if (i + 2 >= n)   
                return nums[i];

            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                continue;     // normal triple
            } else {
                return nums[i];  
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }
}