class Solution {
    int[][] dp;
    public int level(List<List<Integer>> triangle, int row, int col)
    {
        if(row == 0)
        {
            return triangle.get(0).get(0);
        }
        if(col != -1 && dp[row][col] < Integer.MAX_VALUE)
        {
            return dp[row][col];
        }
        if(col == -1)
        {
            int min = Integer.MAX_VALUE;

            for(int i = 0; i <= row; i++)
            {
                min = Math.min(min, level(triangle, row, i));
            }

            return min;
        }
        else
        {
            if(col == 0)
            {
                return dp[row][col] = level(triangle, row-1, col) + triangle.get(row).get(col);
            }
            else if(col == triangle.get(row).size() - 1)
            {
                return dp[row][col] = level(triangle, row-1, col - 1) + triangle.get(row).get(col);
            }
            else return dp[row][col] = Math.min(level(triangle, row-1, col), level(triangle, row-1, col - 1)) + triangle.get(row).get(col);
        }
    }
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int n = triangle.size();
        dp = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        return level(triangle, n-1, -1);
    }
}