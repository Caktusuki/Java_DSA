// 88. Merge Sorted Array
package Leetcode.Easy;

public class Leet_88 {
    public static void main(String[] args) {
        Leet_88 obj = new Leet_88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        obj.merge(nums1, m, nums2, n);
        for (int i=0; i<m+n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; // Pointer for nums1
        int j = n-1; // Pointer for nums2
        int k = m+n-1; // Pointer for merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}
