package leet_code;

import java.util.HashSet;
import java.util.*;
import  java.util.Arrays;
public class MountainArray {
    public static  int findInMountainArray(int target, int mountainArr[]) {
        int n = mountainArr.length;
        int low= 0;
        int high = n-1;
        int peak = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(low< mid && mountainArr[mid] < mountainArr[mid-1]) {
                high = mid-1;
            } else if( high> mid && mountainArr[mid] < mountainArr[mid+1]) {
                low = mid+1;
            } else {
                peak = mid;
                break;
            }
        }
        if(peak == -1) {
            peak = high;
        }
        int peakEle = mountainArr[peak];
        if(peakEle == target) {
            return peak;
        }
        if (peakEle < target) {
            return -1;
        }
        int index = find(0, peak-1, target, mountainArr, true);
        if ( index != -1) {
            return index;
        }
        index = find(peak +1, n-1, target, mountainArr, false);
        return index;
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
