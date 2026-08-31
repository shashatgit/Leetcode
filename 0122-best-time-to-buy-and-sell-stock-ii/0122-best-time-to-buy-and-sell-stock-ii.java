class Solution {
    int m;
    int [][] dp;
    public int calc(int[] prices, int n, int buy)
    {
        int profit = 0;
        if(n == m)
        {
            return 0;
        }
        if (dp[n][buy] != -1) return dp[n][buy];
        if(buy == 1)
        {
            dp[n][1] = Math.max(-prices[n] + calc(prices, n+1, 0), calc(prices, n+1, 1));
            profit = dp[n][1];
        }
        if(buy == 0)
        {
            dp[n][0] = Math.max(prices[n] + calc(prices, n+1, 1), calc(prices, n+1, 0));
            profit = dp[n][0];
        }
        return profit;
    }
    public int maxProfit(int[] prices) {
        m = prices.length;
        dp = new int[m+1][2];
        for(int i = 0; i < m; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return calc(prices, 0, 1);
    }
}