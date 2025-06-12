class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        if (nums [nums.length-1] == k )
        {
            count++;
        }
        for (int i = 0; i < nums.length-1; i++)
        {
            int sum = nums[i];
            if (sum == k)
            {
                count++;
            }
            for (int j = i+1; j < nums.length; j++)
            {
                sum = sum + nums[j];
                if (sum == k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}