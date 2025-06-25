class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if (nums.length <= 2)
        {
            return Math.min(nums[low],nums[high]);
        }
        int mid = low + (high-low)/2;
        while (low < high)
        {
            mid = low + (high-low)/2;
           
            if (nums[low] > nums[mid])
            {
                if (nums[mid-1] > nums[mid])
                {
                    return nums[mid];
                }
                high = mid-1;
            }
            else if (nums[mid] > nums[high])
            {
                if (nums[mid+1] < nums[mid])
                {
                    return nums[mid+1];
                }
                low = mid+1;
            }
            else return nums[low];


        }
        return nums[mid];
    }
}