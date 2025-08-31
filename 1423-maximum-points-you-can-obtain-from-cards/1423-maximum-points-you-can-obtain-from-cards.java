class Solution {
    public int sumOf(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if (k == n)
        {
            return sumOf(cardPoints);
        }
        int l = 0;
        int r = n - 1; 
        int lsum = 0;
        int rsum = 0;
        int max = 0;
        for (l = 0; l < k; l++)
        {
            lsum = lsum + cardPoints[l];
        }
        l--;
        int sum = lsum + rsum;
        max = Math.max(max, sum);
        while (l >= 0)
        {
            lsum -= cardPoints[l];
            l--;
            rsum += cardPoints[r];
            r--; 
            sum = lsum + rsum;
            max = Math.max(max, sum);
        }
        
        return max;
    }
}