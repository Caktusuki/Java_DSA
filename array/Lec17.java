package array;

public class Lec17 {
    //Find the duplicate element in an array of n+1 elements where each element is between 1 and n (inclusive).
    public static void duplicate(int[]arr){
        int n=arr.length;
        int mid=n/2;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=arr[mid]){
                     continue;
            }
            else{
                System.out.println("Duplicate element is "+arr[i]);
                return;
            }
        }
    }
    //move 1 at first
    public static void move(int[] arr){
        int c =0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,1};
        duplicate(arr);
    }
    
}
