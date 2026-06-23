class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int n = prices.length;
        int cost = prices[0];
        int profit = 0;
        while(j < n)
        {
            if(prices[j] < prices[i])
            {
                profit += prices[i] - cost;
                cost = prices[j];
            }
            i++;
            j++;
        }
        if (prices[n - 1] > cost)
        {
            profit += prices[n-1] - cost;
        }
        return profit;
    }
}