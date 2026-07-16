class Solution {
    public int gcd(int x, int y)
    {
        if(y == 0) return x;
        return gcd(y, x%y);
        
    }
    public long gcdSum(int[] nums) {
        long sum = 0;
        int n = nums.length;
        int max = 0;
        int[] pref = new int[n];
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, nums[i]);
            if(max == nums[i]) pref[i] = max;
            else pref[i] = gcd(max, nums[i]);
        }
        Arrays.sort(pref);
        int i = 0;
        int j = n-1;
        while(i < j)
        {
            sum += gcd(pref[i], pref[j]);
            i++;
            j--;
        }
        return sum;
    }
}