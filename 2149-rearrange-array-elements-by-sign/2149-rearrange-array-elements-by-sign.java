class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x = 0;
        int y = 1;  
        int[] result = new int[nums.length];
        for (int i = 0 ; i < nums.length; i++)
        {
            if (nums[i] >= 0)
            {
                result[x] = nums[i];
                x = x + 2;
            }
            else 
            {
                result[y] = nums[i];
                y = y + 2;
            }
        }
        return result; 
    }
}