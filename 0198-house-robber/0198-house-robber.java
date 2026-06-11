class Solution {
    public int best(int[] dp, int[] nums, int n)
    {
        if(n == 0) return nums[0];
        if(n < 0) return 0;
        if(dp[n] >= 0) return dp[n];
        int pick = best(dp, nums, n-2) + nums[n];
        int not_pick = 0 + best(dp, nums, n-1);
        dp[n] = Math.max(pick, not_pick);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return best(dp, nums, n-1);
    }
}