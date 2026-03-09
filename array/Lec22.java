package array;

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

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        int ans = single(nums);

        System.out.println(ans);
    }
}