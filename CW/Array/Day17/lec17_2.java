// 26th February 2026
package CW.Array.Day17;

public class lec17_2 {

    public static void binarySearch(int[] arr, int targe) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == targe) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < targe) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        binarySearch(arr, target);
    }
}
