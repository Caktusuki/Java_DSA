// 852. Peak Index in a Mountain Array
package Leetcode.Medium;

public class Leet_852 {

    public int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length-2;
        while(start < end){
            int mid = start + (end - start) / 2;          
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            } else if(arr[mid-1] < arr[mid]){ // increasing
                start = mid + 1;
            } else { // decreasing
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Leet_852 obj = new Leet_852();
        int[] arr = {0, 1, 0};
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}
