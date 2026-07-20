class Solution {
    int m, n;
    public void helper(int[][] grid)
    {
        int[] temp = new int[m];
        for(int i = 0; i < m; i++)
        {
            temp[i] = grid[i][n-1];
        }
        for(int i = m-1; i >= 0; i--)
        {
            for(int j = n-1; j > 0; j--)
            {
                grid[i][j] = grid[i][j-1];
            }
        }
        for(int i = 0; i < m; i++)
        {
            if(i == 0) grid[i][0] = temp[m-1];
            else grid[i][0] = temp[i-1];
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < k; i++)
        {
            helper(grid);
        }
        for(int i = 0; i < m; i++)
        {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++)
            {
                row.add(grid[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}