class Solution {
    public int gcd(int x, int y)
    {
        if (y == 0) return x;
        return gcd(y, x % y);
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(min, max);
    }
}