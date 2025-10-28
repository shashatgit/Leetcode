class Solution {
    int res = 0;
    public void check(int ind, int ls, int[] nums)
    {
        int n = nums.length;
        int rs = 0;
        for (int j = ind; j < n; j++)
        {
            rs += nums[j];
        }
        if (ls == rs) res = res + 2;
        else if (Math.abs(ls-rs) == 1) res = res + 1;
        return;
    }
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        for(int i = 0; i < n; i++)
        {
            currSum += nums[i];
            if(nums[i] == 0) check(i,currSum,nums);
        }
        return res;
    }
}