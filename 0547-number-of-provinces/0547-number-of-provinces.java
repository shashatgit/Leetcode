class Solution {
    public void dfs (int[][] adj, int node, int[] vis)
    {
        int n = adj.length;
        for(int i = 0; i < n; i++)
        {
            if(adj[node][i] == 1) vis[i] = 1;
        }
        return;
    }
    public int findCircleNum(int[][] isConnected)
    {
        int n = isConnected.length;
        int[] vis = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(vis[i] == 0)
            {
                count++;
                dfs(isConnected,i,vis);
            }
        }
        return count;
    }
}