class Solution {
    public int check (int d, int[] arr, int adj)
    {
        int count = 0;
        int bouquet = 0;

        for (int i : arr)
        {
            if (d >= i)
            {
                count++;
            }
            else count = 0;
            if (count >= adj)
            {
                bouquet++;
                count = 0;
            }
        }   
        return bouquet; 
    }

    public int max (int arr[])
    {
        int m = Integer.MIN_VALUE;

        for (int i : arr)
        {
            if (i > m)
            {
                m = i;
            }
            }
        return m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int high = max(bloomDay);
        int low = 0;
        int ans = -1;
        while (low <= high)
        {
            int mid = low + (high-low)/2;

            if (check(mid,bloomDay,k) >= m)
            {
                ans = mid;
                high = mid - 1;
            }
            else low = low + 1;
        }
        return ans;
    }
}