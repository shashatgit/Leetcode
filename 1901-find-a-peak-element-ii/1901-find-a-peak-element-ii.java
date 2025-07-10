class Solution {
    public int max (int[] arr)
    {
        int max = arr[0];
        for (int i : arr)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }
    public int checkPeak(int[][] mat, int x, int y)
    {
        int len_x = mat.length - 1;
        int len_y = mat[0].length - 1;

        if (y == len_y)
        {
            if (mat[x][y] > mat[x][y-1])
            {
                return 0;
            }
            else return -1;
        }
        else if (y == 0)
        {
            if (mat[x][y] > mat[x][y+1])
            {
                return 0;
            }
            else return 1;
        }
        else{
            if (mat[x][y] > mat[x][y-1] && mat[x][y] > mat[x][y+1])
            {
                return 0;
            }
            else if (mat[x][y] > mat[x][y-1])
            {
                return 1;
            }
            else return -1;
        }
        
    }
    public int[] findPeakGrid(int[][] mat) {
        int high = mat[0].length - 1;
        int low = 0;
        if (high == 0)
        {
            return new int[] {0,0};
        }
        while (low <= high){
            int mid = low + (high-low)/2;
            int max_ind = 0;

            for (int i = 0; i < mat.length; i++)
            {
                if (mat[i][mid] > mat[max_ind][mid])
                {
                    max_ind = i;
                }
            }

            int check = checkPeak(mat,max_ind,mid);

            if ( check == 0)
            {
                return new int[] {max_ind,mid};
            }
            else if (check == 1)
            {
                low = mid + 1;
            }
            else high = mid - 1;
            
        }
        return new int[] {-1,-1};
    }
}