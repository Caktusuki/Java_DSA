package Homework;

public class Turnbased {
    public static int[] turn(int[] arr, int n) {
        int scoreA = 0;
        int scoreB = 0;
        int i = 0; 
        int j = n - 1;
        boolean isTurnA = true;
        while (i <= j) {
            if (isTurnA) {
                scoreA += arr[i];
                i++;
            } else {
                scoreB += arr[j];
                j--;
            }
            isTurnA = !isTurnA;
        }
        return new int[]{scoreA, scoreB};
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        int n = arr.length;
        int[] results = turn(arr, n);
        System.out.println("Final Scores -> A: " + results[0] + ", B: " + results[1]);
    }
}