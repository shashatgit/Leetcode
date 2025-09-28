class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--)
        {
            int uno = nums[i-2];
            int dos = nums[i-1];
            int tres = nums[i];
            if (uno + dos > tres)
            {
                return uno+dos+tres;
            }
        }
        return 0;
    }
}