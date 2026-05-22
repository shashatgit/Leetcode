class Solution {
    public int climbStairs(int n) {
        if (n < 2) return 1;
        int left = 1;
        int right = 1;
        int ans = 0;
        for (int i = 2; i < n+1; i++)
        {
            ans = left+right;
            left = right;
            right = ans;
        }
        return ans;
    }
}