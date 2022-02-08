package BinarySearch;

import java.util.Arrays;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(        find_range(arr,target)
        );
     }
    static int find_range(int[] arr , int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr , int target,int start,int end){
        while(start<=end){
            int middle = start+(end-start)/2;
            if(target>arr[middle]){
                start=middle+1;
            }
            else if(target<arr[middle]){
                end = middle-1;
            }else {
                return middle;
            }
        }
        return -1;//if no element present in the array!
    }
}
