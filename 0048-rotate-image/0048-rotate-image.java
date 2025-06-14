class Solution {
    public void reverseArray(int[] nums)
    {
        int x = 0;
        int y = nums.length-1;

        while (y > x)
        {
            int temp = nums[x];
            nums[x] = nums [y];
            nums[y] = temp;
            x++;
            y--;
        }
    }

    public void transpose(int[][] mat)
    {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = i+1; j < mat.length; j++)
            {
               int temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        transpose(matrix);

        for (int[] i : matrix)
        {
            reverseArray(i);
        }
    }
}