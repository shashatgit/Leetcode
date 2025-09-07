class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int count = 0;
        for (int i = 1; i <= n/2; i++)
        {
            ans[count] = i;
            count++;
            ans[count] = -i;
            count++;
        }
        if (n % 2 != 0)
        {
            ans[count] = 0;
        }
        return ans;
    }
}