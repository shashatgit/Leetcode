class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        int n = nums.length - 1;
        if (n < 0) return false;
        if (n == 0) return true; 
        for (int i = 0; i < n; i++)
        {
            if (i > maxIndex) return false;
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if (maxIndex >= n) return true;
        }
        return false;
    }
}