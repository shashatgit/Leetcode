class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int high = matrix.length - 1;
        int low = 0;
        int ans = low;
        while (low <= high)
        {
            if (high == -1) break;
            int mid = low + (high - low)/2;
            if (matrix[mid][0] > target)
            {
                high = mid - 1;
            }
            else if (matrix[mid][0] < target)
            {
                ans = mid;
                low = mid + 1;
            }
            else return true;
        }
        

        while (ans >= 0){
            high = matrix[0].length - 1;
            low = 0;
            while (low <= high)
            {
                int mid = low + (high - low)/2;
                if (matrix[ans][mid] > target)
                {
                    high = mid - 1;
                }
                else if (matrix[ans][mid] < target)
                {
                    low = mid + 1;
                }
                else return true;
            }
            ans--;
        }
        return false;

    }
}