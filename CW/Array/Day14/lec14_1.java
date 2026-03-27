// 23rd February 2026
package CW.Array.Day14;

public class lec14_1 {
    public static void bubbleSort() {
        int arr[] = {5, 2, 9, 1, 5, 6};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        bubbleSort();
    }
}
