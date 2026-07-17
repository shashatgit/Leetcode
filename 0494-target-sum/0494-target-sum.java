class Solution {
    int[][] dp;
    int sum;
    public int calc(int[] nums, int n, int target)
    {
        if(n == 0)
        {
            int pass = 0;
            if(nums[0] == target) pass++;;
            if(-nums[0] == target) pass++;

            return pass;
        }
        
        if (target > sum || target < -sum)
            return 0;
        if(dp[n][target + sum] != -1) return dp[n][target+sum];
        dp[n][target+sum] = calc(nums, n-1, target - nums[n]) + calc(nums, n-1, target + nums[n]);

        return dp[n][target+sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += nums[i]; 
        }
        dp = new int[n][2*sum + 1];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return calc(nums, n-1, target);
    }
}