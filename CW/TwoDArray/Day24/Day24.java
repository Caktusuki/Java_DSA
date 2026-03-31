package CW.TwoDArray.Day24;
public class Day24 {
    // Binary search
    public static int binarySearch(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return 1; // Element found
            } else if (arr[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        return -1; // Element not found
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == 1) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

}
