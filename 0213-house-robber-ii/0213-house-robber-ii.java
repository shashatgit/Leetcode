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
        if (n == 1) return nums[0];
        int[] dpf = new int[n];
        int[] dpl = new int[n];
        Arrays.fill(dpf, -1);
        Arrays.fill(dpl, -1);
        int[] firstTaken = new int[n-1];
        int[] lastTaken = new int[n-1];
        for(int i = 0; i < n-1; i++)
        {
            firstTaken[i] = nums[i];
        }
        for(int i = 1; i < n; i++)
        {
            lastTaken[i-1] = nums[i];
        }
        return Math.max(best(dpf, firstTaken, n-2), best(dpl, lastTaken, n-2));
    }
}