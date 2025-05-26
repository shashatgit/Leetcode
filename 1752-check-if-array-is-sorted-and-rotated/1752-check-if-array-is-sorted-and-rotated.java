class Solution {
    public boolean check(int[] nums) {
        int min = nums[0];
        int index = 0;
        int last = nums[nums.length-1];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] < min)
            {
                min = nums[i];
                index = i;
            }
        }
        for (int i = index; i < nums.length-1; i++)
        {
            if (nums[i]>nums[i+1])
            {
                return false;
            }
        }
        for (int i = 0; i < nums[index]; i++)
        {
            if (nums[i]>nums[i+1])
            {
                return false;
            }
        }
        return true;
    }
}