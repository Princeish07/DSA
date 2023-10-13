package leet_code;

import java.util.HashSet;
import java.util.*;
import  java.util.Arrays;
public class MountainArray {

    public static  int findInMountainArray(int target, int mountainArr[]) {
        Arrays.sort(mountainArr);
        int count = 0;
        int low = 0;
        int high = mountainArr.length-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mountainArr[mid] == target)
                count++;

            if (mountainArr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }
        if(count>=0){
            return count;
        }else{
            return  -1;
        }
    }


    public static int find(int low, int high, int target, int[] nums, boolean up) {
        if(up) {
            while(low<=high) {
                int mid = (low+high)/2;
                if(nums[mid] == target) {
                    return mid;
                } else if(nums[mid] < target){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
            return -1;
        } else {
            while(low<=high) {
                int mid = (low+high)/2;
                if(nums[mid] == target) {
                    return mid;
                } else if(nums[mid] > target){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
            return -1;
        }
    }
}
