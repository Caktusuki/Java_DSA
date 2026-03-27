// 23rd February 2026
package CW.Array.Day14;

public class lec14_2 {
    public static void selectionSort() {
        int arr[] = {4, 5, 3, 2, 1};
        int min = 0;
        for(int i=0; i<arr.length; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        selectionSort();
    }
}
