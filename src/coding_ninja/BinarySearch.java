package coding_ninja;

public class BinarySearch {
    public static int search(int []nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int fountAtIndex = 0;
        while (low<=high){
            int mid = low + (high -low);
            if(nums[mid]==target){
                fountAtIndex = mid;
            }
            if(nums[mid]<target){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        if (fountAtIndex>=0) {
            return fountAtIndex;
        }else {
            return  -1;
        }
    }
}
