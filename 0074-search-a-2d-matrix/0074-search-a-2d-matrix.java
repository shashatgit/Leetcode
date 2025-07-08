class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int high = matrix.length - 1;
        int low = 0;
        int ans = low;
        while (low <= high)
        {
            if (high == 0) break;
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
        
        return false;

    }
}