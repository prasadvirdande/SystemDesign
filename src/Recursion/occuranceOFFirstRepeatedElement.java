
package Recursion;

public class occuranceOFFirstRepeatedElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4};

        int result = firstOccurance(arr, 0);
        System.out.println(result);
    }

    public static int firstOccurance(int[] arr, int index) {
        if (index >= arr.length) {
            return -1;
        }

        if (checkDuplicate(arr, index + 1, arr[index])) {
            return arr[index];
        }

        return firstOccurance(arr, index + 1);
    }

    public static boolean checkDuplicate(int[] arr, int j, int target) {
        if (j >= arr.length) {
            return false;
        }

        if (arr[j] == target) {
            return true;
        }

        return checkDuplicate(arr, j + 1, target);
    }
}

