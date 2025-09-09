class Solution {
    public int findCenter(int[][] edges) {
        for (int i = 1; i < edges.length; i++)
        {
            if (edges[i-1][1] == edges[i][0])
            {
                return edges[i][0];
            }
            else if (edges[i-1][1] == edges[i][1])
            {
                return edges[i][1];
            }
        
        }
        return -1;
    }
}