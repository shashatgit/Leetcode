class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = (nums.length-1)/2;

        while (high > low){
            if (target > nums[mid])
            {
                low = mid+1;
                mid = (low + high)/2;
            }
            else if (target < nums[mid])
            {
                high = mid-1;
                mid = (low+high)/2;
            }
            else return mid;
        }
        return -1;
    }
}