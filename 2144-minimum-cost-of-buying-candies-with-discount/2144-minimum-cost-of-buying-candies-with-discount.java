class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int purchaseNum = 0;
        int purchaseSum = 0;
        for (int i = n - 1; i >= 0; i--)
        {
            if(purchaseNum < 2)
            {
                purchaseSum += cost[i];
                purchaseNum++;
            }
            else 
            {
                purchaseNum = 0;
                continue;
            }
        }
        return purchaseSum;
    }
}