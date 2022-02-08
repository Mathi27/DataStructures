package BinarySearch;

import java.util.Arrays;

public class Firstoccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] x =searchRange(arr,target);
        System.out.println(Arrays.toString(x));
    }
    public static int[] searchRange(int[] nums, int target){
        int[] res = {-1,-1};
        int first = bs(nums,target,true);
        int last = bs(nums,target,false);
        res[0]=first;
        res[1]=last;
        return res;
    }
    static int bs(int[] nums, int target,boolean FirstIndex){
        int start = 0;
        int end = nums.length-1;
        int ans=-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid-1;
            }else {
                //check for occurances
                // potential ans found.like return mid
                ans=mid;
                if(FirstIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

