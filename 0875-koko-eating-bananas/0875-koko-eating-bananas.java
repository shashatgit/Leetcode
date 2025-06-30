class Solution {
    public int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i: arr)
        {                
            if (i > max) max = i;
        }
        return max;
    }
    public boolean check(int m, int[] arr, int h)
    {
        long sum = 0;
        for (int i : arr)
        {
            sum += (i + (long)m - 1) / m;
        }
        if (sum <= h) return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high = findMax(piles);
        int low = 1;
        
        int ans = high;
        while (high >= low)
        {
            int mid = low + (high-low)/2;
            if (check(mid,piles,h))
            {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;

        
    }
}