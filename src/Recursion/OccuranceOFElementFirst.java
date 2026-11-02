
package Recursion;

public class OccuranceOFElementFirst {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9};
        int target = 2;

        int result = firstOccurance(arr, target, 0);
        System.out.println(result);
    }

    public static int firstOccurance(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return firstOccurance(arr, target, index + 1);
    }
}

