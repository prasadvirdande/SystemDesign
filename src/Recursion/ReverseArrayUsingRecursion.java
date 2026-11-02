package Recursion;

public class ReverseArrayUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
      int b[] = reverseArray(arr, 0,arr.length-1);
      for(int ele:b){
        System.out.print(ele+ " ");
      }
    }
    public static int[] reverseArray(int[] arr, int start, int end) {

        if(start>=end) return arr;
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        reverseArray(arr, start, end);

        return arr;
    }
}
