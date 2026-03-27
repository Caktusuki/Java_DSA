// 4. Median of Two Sorted Arrays
package Leetcode.Hard;

public class Leet_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;

        int i = 0, j = 0;
        int prev = 0, curr = 0;

        for (int k = 0; k <= total / 2; k++) {

            prev = curr;

            if (i < m && (j >= n || nums1[i] < nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
        }

        if (total % 2 == 1) {
            return curr;
        }

        return (prev + curr) / 2.0;
    }

    public static void main(String[] args) {
        Leet_4 obj = new Leet_4();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(obj.findMedianSortedArrays(nums1, nums2)); // Output: 2.0
    }
}
