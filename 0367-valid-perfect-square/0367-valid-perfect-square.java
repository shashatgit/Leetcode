class Solution {
    public boolean isPerfectSquare(int num) {
        long high = num/2;
        long low = 1;
        long mid = low + (high-low)/2;
        if (num == low) return true;
        while (low <= high)
        {
            mid = low + (high-low)/2;
            long squared = mid*mid;
            if (squared < num)
            {
                low = mid + 1;
            }
            else if (squared > num)
            {
                high = mid - 1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}