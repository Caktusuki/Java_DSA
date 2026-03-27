// 189. Rotate Array
package Leetcode.Medium;

public class Leet_189 {
    // Approach 1: Brute Force
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        for(int i=0; i<k; i++){
            int last = nums[n-1];
            for(int j=n-1; j>0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }
    }

    // Approach 2: Optimized Reversal
    public static void rotateOptimized(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1); // Reverse the entire array
        reverse(nums, 0, k-1); // Reverse the first k elements
        reverse(nums, k, n-1); // Reverse the remaining n-k elements
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;
        // rotate(array, k);
        rotateOptimized(array, k);
        System.out.println("Rotated array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
