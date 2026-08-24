class Solution {
    int[][] dp;
    public boolean calc(String s, String p, int n, int m)
    {
        if(n < 0 && m < 0) return true;
        if(m < 0 && n >= 0) return false;
        if(n < 0 && m >= 0)
        {
            for(int i = 0; i <= m; i++)
            {
                if(p.charAt(i) != '*') return false;
            }
            return true;
        }
        if(dp[n][m] != -1) 
        {
            if(dp[n][m] == 0) return false;
            else return true;
        }
        if(s.charAt(n) == p.charAt(m) || p.charAt(m) == '?')
        {
            if(calc(s, p, n-1, m-1) == true)
            {
                dp[n][m] = 1;
                return true;
            }
            else
            {
                dp[n][m] = 0;
                return false;
            }
        }
        else if(p.charAt(m) == '*')
        {
            if((calc(s, p, n-1, m) || calc(s, p , n, m-1)) == true)
            {
                dp[n][m] = 1;
                return true;
            }
            else
            {
                dp[n][m] = 0;
                return false;
            }
        }
        else 
        {
            dp[n][m] = 0;
            return false;
        }
    }
    public boolean isMatch(String s, String p) 
    {
        int n = s.length();
        int m = p.length();
        dp = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return calc (s, p, n-1, m-1);
    }
}