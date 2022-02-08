package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2d {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        System.out.println("Enter a matrix num to find the index");
        System.out.println("" +
                "          {10,20,30,40}\n" +
                "          {15,25,35,45}\n" +
                "          {28,29,37,49}\n" +
                "          {33,34,38,50}");
        System.out.println("Enter values :");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int target = x;
        int[] ans = Matrix(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Matrix(int[][] arr,int target){
        int row = 0;
        int col = arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                 return new int[]{row,col};
            }else if(arr[row][col]>target){
                col--;
            }else if(arr[row][col]<target){
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
