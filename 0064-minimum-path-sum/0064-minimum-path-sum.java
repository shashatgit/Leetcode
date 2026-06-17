class Solution {
    public int curr(int[][] dp, int[][] grid, int x, int y)
    {
        if(x == 0 && y == 0)
        {
            return grid[0][0];
        }
        else if(x < 0 || y < 0)
        {
            return 999999;
        }
        else if(dp[x][y] > -1)
        {
            return dp[x][y];
        }
        else
        {
            dp[x][y] = Math.min(curr(dp, grid,x-1,y),curr(dp, grid,x,y-1))+grid[x][y];
            return dp[x][y];
        }
    }
    public int minPathSum(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return curr(dp, grid, m-1, n-1);
    }
}