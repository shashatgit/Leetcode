class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long min = Integer.MAX_VALUE;
        long negCount = 0;
        long sum = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                int curr = matrix[i][j];
                if(curr < 0)
                {
                    negCount++; 
                }
                sum += Math.abs(curr);
                min = Math.min(Math.abs(curr),min);
            }
        }
        if(negCount % 2 == 0) return sum;
        else return sum-(2*min);
    }
}