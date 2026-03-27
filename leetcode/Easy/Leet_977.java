package Leetcode.Easy;

import java.util.Arrays;

public class Leet_977 {
    public static void main(String[] args) {
            Leet_977 leet = new Leet_977();
            int[] nums = {-4,-1,0,3,10};
            int[] result = leet.sortedSquares(nums);
            System.out.println(Arrays.toString(result));
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
