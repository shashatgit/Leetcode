class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = (low + high)/2;
        int exist = -1;
        
        while (high >= low && exist == -1)
        {
            mid = (high+low)/2;

            if (target > nums[mid])
            {
                low = mid + 1;
            }
            else if (target < nums[mid])
            {
                high = mid - 1;
            }
            else 
            {
                exist = mid;
            }
        }

        if(exist == -1) 
        {
            return new int[] {-1,-1};
        }

        int si = exist;
        int li = exist;
        for (int i = exist; i < nums.length; i++)
        {
            if (nums[i] != target)
            {
                break;
            }
            si++;
        }
        for (int i = exist; i >=0; i--)
        {
            if (nums[i] != target)
            {
                break;
            }
            li--;
        }
        return new int[]  {li+1,si-1};
    }
}