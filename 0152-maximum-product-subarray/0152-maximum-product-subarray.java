class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length < 2)
        {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++)
        {
            int prod = nums[i];
            if (prod > max)
                {
                    max = prod;
                }
            for (int j = i + 1; j < nums.length; j++)
            {
                prod = prod * nums[j];
                if (prod > max)
                {
                    max = prod;
                }
                if (prod == 0)
                {
                    break;
                }
            }
        }
        return max;
    }
}