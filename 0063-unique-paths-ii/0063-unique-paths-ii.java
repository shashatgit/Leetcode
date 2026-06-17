class Solution {
    public int prevStep(int[][] o, int[][] dp,int m, int n, int x, int y)
    {
        if(x == 0 && y == 0)
        {
            return 1;
        }
        else if(x < 0 || y < 0)
        {
            return 0;
        }
        if(o[x][y] == 1) return 0;
        if(dp[y][x] >= 0)
        {
            return dp[y][x];
        }
        int down = prevStep(o,dp,m,n,x,y-1);
        int right = prevStep(o,dp,m,n,x-1,y);
        dp[y][x] = down+right;
        return down+right;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(m == 1 && n == 1)
        {
            if(obstacleGrid[0][0] == 0) return 1;
            else return 0;
        }
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        int paths = prevStep(obstacleGrid,dp,m,n,n-1,m-1);
        return paths;
    }
}