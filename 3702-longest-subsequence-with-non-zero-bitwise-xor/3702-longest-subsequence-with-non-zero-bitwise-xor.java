class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int x = 0;
        int flag = 0;
        for(int i = 0; i < n; i++)
        {
            x = x ^ nums[i];
            if(nums[i] != 0) flag = 1;
        }
        if(flag == 0) return 0;
        if(x != 0) return n;
        else return n-1;
    }
}