class Solution {
    int[][]dp;
    int big = 100000009;
    public int calc(int[]coins,  int amt, int n)
    {
        if(n == 0)
        {
            if(amt % coins[n] == 0) return amt/coins[n];
            else return big;
        }
        if(dp[n][amt] != -1) return dp[n][amt];
        if(amt == 0) return 0;
        int take = big;
        if(coins[n] <= amt) take = 1 + calc(coins, amt - coins[n], n);
        int notTake = calc(coins, amt, n-1);

        dp[n][amt] =  Math.min(take, notTake);
        return dp[n][amt];
    }
    public int coinChange(int[] coins, int amount) 
    {
        if(amount == 0) return 0;
        int n = coins.length;
        dp = new int[n][amount+1];
        for(int i = 0; i < n ; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        int ans = calc(coins, amount, n - 1);
        if(amount > 0 && ans == big) return -1;
        else return ans;
    }
}