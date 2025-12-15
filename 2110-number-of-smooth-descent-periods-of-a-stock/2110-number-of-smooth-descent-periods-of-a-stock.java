class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 0;
        int streak = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++){
            if (prices[i-1]-prices[i] == 1)
            {
                streak++;
                ans+=streak;
            }
            else streak = 0;
        }
        return ans+n;
    }
}