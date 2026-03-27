// 23rd February 2026
package CW.Array.Day14;

public class lec14_3 {
    public static void insersionSort(){
        int arr[] = { 4, 5, 3, 2, 1 };
        for(int i=1; i<arr.length; i++){
            int item = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > item){
                arr[j+1] = arr[j];
                arr[j] = item;
                j--;
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        insersionSort();
    }
}
