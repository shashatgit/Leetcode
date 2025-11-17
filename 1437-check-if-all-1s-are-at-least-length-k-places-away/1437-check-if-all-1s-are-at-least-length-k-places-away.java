class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int dist = 0;
        while (i < n && nums[i] != 1) i++;
        if (i >= n) return true;
        i++;
        for (i = i; i < n; i++)
        {
            if(nums[i] == 1)
            {
                if(dist < k) return false;
                dist = 0;
            }
            else dist++;
        }
        return true;
    }
}