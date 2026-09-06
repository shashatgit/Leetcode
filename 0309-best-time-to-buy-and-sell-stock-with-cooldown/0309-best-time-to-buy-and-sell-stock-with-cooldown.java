class Solution {
    int m;
    int [][][] dp;
    public int calc(int[] prices, int n, int buy, int cd)
    {
        int profit = 0;
        if(n == m)
        {
            return 0;
        }
        if (dp[n][buy][cd] != -1) return dp[n][buy][cd];
        if(cd == 1) return calc(prices, n+1, 1, 0);
        if(buy == 1)
        {
            dp[n][1][cd] = Math.max(-prices[n] + calc(prices, n+1, 0, 0), calc(prices, n+1, 1, 0));
            profit = dp[n][1][cd];
        }
        if(buy == 0)
        {
            dp[n][0][cd] = Math.max(prices[n] + calc(prices, n+1, 1, 1), calc(prices, n+1, 0, 0));
            profit = dp[n][0][cd];
        }
        return profit;
    }
    public int maxProfit(int[] prices) {
        m = prices.length;
        dp = new int[m][2][2];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return calc(prices, 0, 1, 0);
    }
}