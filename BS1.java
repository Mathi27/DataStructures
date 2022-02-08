package BinarySearch;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiDevice;
import java.util.Scanner;

public class BS1 {
    public static void main(String[] args) {
//       int[] sortedArray = {2,4,6,8,10,12,14, 16,20};
//       int ans = binarySearch(sortedArray,16);
//        System.out.print("Enter number to search:\t");
//        Scanner in = new Scanner(System.in);
//        int input = in.nextInt();
//       int res = BS(sortedArray,input);
//        System.out.println(res);
        int[] check_array = {9,8,7,6,5,4,3,2,1};
        int res = Order_agnostic_binarySearch(check_array,3);
        System.out.println(res);
//        System.out.println(ans);
    }
    static int Order_agnostic_binarySearch(int[] arr , int TargetValue){
        //check for ascending order
        int start =0;
        int end = arr.length-1;

        boolean isAscending = arr[start]<arr[end];

        while (start <= end){
            int mid_value = start+(end-start)/2;
            if(arr[mid_value] == TargetValue){
                return mid_value;
            }
         // 1 2 3 4 5 6 7 8 9 10 : t=10;
            if(isAscending){
            if(TargetValue>arr[mid_value]){
                start = mid_value+1;
            }else {
                end = mid_value-1;
            }
        }
        // 10 9 8 7 6 5 4 3 2 1  ; target = 9;
        else {
            if(TargetValue > arr[mid_value]){
                end = mid_value-1;
            }
            else {
                start = mid_value+1;
            }
        }
        }
        return -1;
    }
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while (start<= end){
            int middle_element = start+(end -start)/2;
            if(target<arr[middle_element]){
                end = middle_element-1;
            }
            else if(target>arr[middle_element]){
               start = middle_element+1;
            }
        }
        return -1;//return -1 if the element is not present in the array.

    }

    static int BS(int[] arr ,int target){
        int start = 0;
        int end = arr.length -1;

        while (start<=end) {
            int middle_element = start + (end - start) / 2;
            if (target < arr[middle_element]) {
                end = middle_element - 1;
            }else if(target > arr[middle_element]){
                  start = middle_element+1;
            }else
                return middle_element;
        }
        return -1;
    }
}
