class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int ret = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++)
        {
            ret = prices[i] - bestBuy;
            maxProfit = Math.max(ret,maxProfit);
            bestBuy = Math.min(prices[i],bestBuy);
        }
        return maxProfit;
    }
}