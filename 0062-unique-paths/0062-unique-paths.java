class Solution {
    public int prevStep(int[][] dp,int m, int n, int x, int y)
    {
        if(x == 0 && y == 0)
        {
            return 1;
        }
        else if(x < 0 || y < 0)
        {
            return 0;
        }
        if(dp[y][x] > 0)
        {
            return dp[y][x];
        }
        int down = prevStep(dp,m,n,x,y-1);
        int right = prevStep(dp,m,n,x-1,y);
        dp[y][x] = down+right;
        return down+right;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int paths = prevStep(dp,m,n,n-1,m-1);
        return paths;
    }
}