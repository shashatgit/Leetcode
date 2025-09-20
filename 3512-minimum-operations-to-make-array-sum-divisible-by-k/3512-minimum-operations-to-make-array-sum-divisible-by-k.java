class Solution {
    public int sum(int[] nums)
    {
        int count = 0;
        for (int i : nums)
        {
            count += i;
        }
        return count;
    }
    public int minOperations(int[] nums, int k) {
        return sum(nums)%k;
    }
}