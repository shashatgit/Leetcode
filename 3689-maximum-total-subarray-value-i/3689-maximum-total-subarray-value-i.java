class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return (long)k*(nums[n-1] - nums[0]);
    }
}