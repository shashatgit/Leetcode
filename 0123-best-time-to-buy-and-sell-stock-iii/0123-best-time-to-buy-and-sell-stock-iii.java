class Solution {
    int m;
    int [][][] dp;
    public int calc(int[] prices, int n, int buy, int cap)
    {
        int profit = 0;
        if(n == m)
        {
            return 0;
        }
        if (dp[n][buy][cap] != -1) return dp[n][buy][cap];
        if(buy == 1 && cap > 0)
        {
            dp[n][1][cap] = Math.max(-prices[n] + calc(prices, n+1, 0, cap-1), calc(prices, n+1, 1, cap));
            profit = dp[n][1][cap];
        }
        if(buy == 0)
        {
            dp[n][0][cap] = Math.max(prices[n] + calc(prices, n+1, 1, cap), calc(prices, n+1, 0, cap));
            profit = dp[n][0][cap];
        }
        return profit;
    }
    public int maxProfit(int[] prices) {
        m = prices.length;
        dp = new int[m][2][3];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < 2; j++) Arrays.fill(dp[i][j], -1);
        }
        return calc(prices, 0, 1, 2);
    }
}