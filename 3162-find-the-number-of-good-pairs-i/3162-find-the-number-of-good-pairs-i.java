class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            nums2[i] *= k;
            for (int j = 0; j < m; j++)
            {
                if (nums1[j] % nums2[i] == 0) ans++;
            }
        }
        return ans;
    }
}