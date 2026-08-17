class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            esum += nums[i];
            while(nums[i] > 0)
            {
                dsum += nums[i]%10;
                nums[i] = nums[i]/10;
            }
        }
        return Math.abs(esum - dsum);
    }
}