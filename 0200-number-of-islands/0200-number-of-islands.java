class Solution {
    public class Point
    {
        int x;
        int y;

        public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    }
    public void bfs(int[][]vis, char[][] grid, int i, int j, int m, int n)
    {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(i,j));
        while(!q.isEmpty())
        {
            Point org = q.poll();
            int x = org.x;
            int y = org.y;
            vis[x][y] = 1;
            if(x < n-1 && grid[x+1][y] == '1' && vis[x+1][y] == 0)
            {
                q.add(new Point(x+1,y));
                vis[x+1][y] = 1;
            }
            if(x > 0 && grid[x-1][y] == '1' && vis[x-1][y] == 0)
            {
                q.add(new Point(x-1,y));
                vis[x-1][y] = 1;
            }
            if(y < m-1 && grid[x][y+1] == '1' && vis[x][y+1] == 0)
            {
                q.add(new Point(x,y+1));
                vis[x][y+1] = 1;
            }
            if(y > 0 && grid[x][y-1] == '1' && vis[x][y-1] == 0)
            {
                q.add(new Point(x,y-1));
                vis[x][y-1] = 1;
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == '1' && vis[i][j] == 0)
                {
                    bfs(vis, grid, i, j, m, n);
                    count++;
                }
            }
        }
        return count;
    }
}