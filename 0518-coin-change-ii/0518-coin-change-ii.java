class Solution {
    int[][] dp;
    public int calc(int[] coins, int n, int target)
    {
        if(n == 0)
        {
            if(target % coins[0] == 0) return 1;
            else return 0;
        }
        if(target == 0) return 1;
        if(dp[n][target] != -1) return dp[n][target];
        int take = 0;
        if(coins[n] <= target) take = calc(coins, n, target - coins[n]);
        int notTake = calc(coins, n - 1, target);

        dp[n][target] = take + notTake;
        return dp[n][target];
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new int[n][amount+1];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return calc(coins, n-1, amount);
    }
}