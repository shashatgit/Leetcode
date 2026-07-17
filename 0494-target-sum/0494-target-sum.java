class Solution {
    public int calc(int[] nums, int n, int target)
    {
        if(n == 0)
        {
            int pass = 0;
            if(nums[0] == target) pass++;;
            if(-nums[0] == target) pass++;

            return pass;
        }
        int sub = calc(nums, n-1, target - nums[n]);
        int add = calc(nums, n-1, target + nums[n]);

        return sub + add;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        if(n == 1)
        {
            if(nums[0] == target && nums[0] == 0) return 2;
        }
        return calc(nums, n-1, target);
    }
}