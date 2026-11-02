package TWO_DArray;

public class MaxInArray {

    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int max=Integer.MIN_VALUE;
        int row=-1;

        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
                max=Math.max(max, sum);
                row=i;
            }
        }
        System.out.println("Max sum: " + max + " at row: " + row);
    }
}
