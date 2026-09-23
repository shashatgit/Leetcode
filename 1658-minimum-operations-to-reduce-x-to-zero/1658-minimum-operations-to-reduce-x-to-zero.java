class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;

        int sum = 0;
        for(int i : nums) sum += i;
        int target = sum - x;

        if(target < 0) return - 1;
        if(target == 0) return n;

        int l = 0;
        sum = 0;

        int maxLen = -1;

        for(int r = 0; r < n; r++)
        {
            sum += nums[r];

            while(sum > target)
            {
                sum-= nums[l];
                l++;
            }
            if(sum == target)
            {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        if(maxLen == -1) return -1;

        return n - maxLen;
    }
}