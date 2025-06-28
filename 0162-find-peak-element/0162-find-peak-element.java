class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high-low)/2;
        while (low < high)
        {
            mid = low + (high-low)/2;
            if(nums[mid] >= nums[low] && nums[high] >= nums[mid])
            {
                low = mid + 1;
            }
            else if (nums[mid] > nums[low] && nums[high] < nums[mid])
            {
                low++;
                high--;
            }
            else 
            {
                high = mid - 1;
            }
        }
        mid = low + (high-low)/2;
        return mid;
    }
}