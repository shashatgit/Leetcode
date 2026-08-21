class Solution {
    int[][] dp;
    public int calc(String word1, String word2, int i, int j)
    {
        if(i < 0) return j+1;
        if(j < 0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j)) return dp[i][j] = calc(word1,word2,i-1,j-1);
        
        int in = 1 + calc(word1, word2, i, j-1);
        int del = 1 + calc(word1, word2, i-1, j);
        int rep = 1 + calc(word1, word2, i-1, j-1);
        return dp[i][j] = Math.min(rep, Math.min(in, del));
    }
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)) return 0;
        int n = word1.length();
        int m = word2.length();
        if(n == 0) return m;
        if(m == 0) return n;
        dp = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return calc(word1, word2, n-1, m-1);
    }
}