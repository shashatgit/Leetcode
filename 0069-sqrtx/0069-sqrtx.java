class Solution {
    public int mySqrt(int x) {
        if (x == 1) return x;
        int high = x/2;
        int low = 0;
        int ans = low;

        while (low <= high)
        {
            int mid = low + (high-low)/2;
            long checker = (long)mid*(long)mid;
            if (checker == (long)x)
            {
                return mid;
            }
            else if (checker < x)
            {
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
}