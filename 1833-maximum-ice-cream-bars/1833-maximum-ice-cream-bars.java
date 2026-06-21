class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] count = new int[100001];
        int ans = 0;
        int max = 0;
        int n = costs.length;
        for(int i = 0; i < n; i++)
        {
            count[costs[i]]++;
            max = Math.max(costs[i],max);
        }
        int i = 1;
        while(coins > 0 && i <= max)
        {
            if(count[i] > 0 && i <= coins)
            {
                ans++;
                count[i] = count[i]-1;
                coins -= i;
            }
            else i++;
        }
        return ans;
    }
}