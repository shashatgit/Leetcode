class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int brk = 0;
        int lst = nums[n-1];
        for(int i = 0; i < n-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                brk = i+1;
                break;
            }
        }
        for(int i = brk; i < n-1; i++)
        {
            if(nums[i+1] < nums[i]) return false;
        }
        if(nums[0] < lst && brk > 0) return false;
        for(int i = 0; i < brk-1; i++)
        {
            if(nums[i+1] < nums[i]) return false;
        }
        return true;
    }
}