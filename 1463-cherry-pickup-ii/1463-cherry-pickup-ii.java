class Solution {
    int m;
    int n;
    int [][][] dp;
    public int calc(int[][] grid, int a, int b, int r)
    {
        if(a < 0 || a >= m || b < 0 || b >= m)
        {
            return -1000000;
        }
        if(dp[r][a][b] > -1) return dp[r][a][b];
        if(r == n-1)
        {
            if(a == b)
            {
                return grid[r][a];
            }
            else return grid[r][a] + grid[r][b];
        }
        int max = 0;
        for(int i = -1; i < 2; i++)
        {
            for(int j = -1; j < 2; j++)
            {
                int val = 0;
                if(a == b)
                {
                    val = grid[r][a];
                }
                else val = grid[r][a] + grid[r][b];
                val += calc(grid, a+i, b+j, r+1);
                max = Math.max(max, val);
            }
        }
        dp[r][a][b] = max;
        return max;
    }
    public int cherryPickup(int[][] grid) {
        m = grid[0].length;
        n = grid.length;
        dp = new int[n][m][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                Arrays.fill(dp[i][j] , -1);
            }
        }
        return calc(grid, 0, m-1, 0);
    }
}