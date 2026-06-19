class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans = 0;
        int curr = 0;
        for(int i = 0; i < n; i++)
        {
            curr = curr + gain[i];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}