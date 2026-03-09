package array;

import java.util.Arrays;

public class Lec22 {
    // Leetcode - Single Number
    public static int single(int[] nums) {
        int[] arr = new int[1000];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            arr[nums[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }
// with XOR and sorting o(nlogn)
    public static int single2(int[] nums) {
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i+=2) {
            int x = nums[i] ^ nums[i + 1];
            if (x != 0)
                return nums[i];
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 4, 4, 4 };

        // int ans = single(nums);
        int z = single2(nums);

        System.out.println(z);

        // System.out.println(ans);
    }
}