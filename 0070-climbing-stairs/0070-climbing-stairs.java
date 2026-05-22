class Solution {
    int[] dp = new int[46];
    public int climbStairs(int n) {
        if(n < 2) return 1;
        if(dp[n] != 0) return dp[n];
        int res = climbStairs(n-1)+climbStairs(n-2);
        dp[n] = res;
        return res;
    }
}