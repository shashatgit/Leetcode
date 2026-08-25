class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 1;
        int j = 0;
        while(j < n && (k * i) >= nums[j])
        {
            if(nums[j] == k*i)
            {
                i++;
                j++;
            }
            else j++;
        }
        return k*i;
    }
}