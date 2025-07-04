class Solution {
    public int findKthPositive(int[] arr, int k) {
        int high = arr.length-1;
        int low = 0;
        int ans = 0;
        while (low <= high){
            int mid = low + (high-low)/2;

            if (arr[mid] - mid - 1 >= k)
            {
                high = mid - 1;
            }
            else
            {
                ans = mid + 1;
                low = mid + 1;
            }

            
        }
        return ans+k;
    }
}