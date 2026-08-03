class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        if(n % 2 != 0)
        {
            sum -= mat[n/2][n/2];
        }
        int i = 0;
        int j = n - 1;
        int row = 0;
        while(row < n)
        {
            sum += mat[row][j];
            sum += mat[row][i];
            i++;
            j--;
            row++;
        }
        return sum;
    }
}