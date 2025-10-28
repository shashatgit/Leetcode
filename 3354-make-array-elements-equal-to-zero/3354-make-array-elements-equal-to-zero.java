class Solution {
    int res = 0;
    public void check(int ind, int[] nums)
    {
        int n = nums.length;
        int ls = 0;
        int rs = 0;
        for (int i = 0; i < ind; i++)
        {
            ls += nums[i];
        }
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
        for(int i = 0; i < n; i++)
        {
            if(nums[i] == 0) check(i,nums);
        }
        return res;
    }
}