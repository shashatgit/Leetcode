class Solution {
    public int triangularSum(int[] nums) {
        int count = 1;
        int n = nums.length;
        while (count < n)
        {
            for (int i = 0; i < n - count; i++)
            {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            count++;
        }
        return nums[0];
    }
}