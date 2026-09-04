class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        int mn = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            mn = Math.min(mn, nums[i]);
            min[i] = mn;
        }
        int max = nums[0];
        for(int i = 0; i < n; i++)
        {
            if(nums[i] > max) max = nums[i];
            if(max - min[i] <= k) return i;
        }
        return -1;
    }
}