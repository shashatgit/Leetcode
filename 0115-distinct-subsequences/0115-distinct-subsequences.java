class Solution {
    int[][] dp;
    public int calc(String s, String t, int i, int j)
    {
        if(j < 0) return 1;
        if(i < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j))
        {
            dp[i][j] = calc(s, t, i-1, j-1) + calc(s, t, i-1, j);
            return dp[i][j];
        }
        else
        {
            dp[i][j] = calc(s, t, i-1, j);
            return dp[i][j];
        }
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        dp = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return calc(s, t, n-1, m-1);
    }
}