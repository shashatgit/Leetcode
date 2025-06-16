class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i ; i < nums.length; i++)
        {
            int check = target-nums[i];
            if (set.contains(check))
            {
                int[] res = {check, nums[i]};
                return res;
            }
            set.add(nums[i]);
        }
        return new int[] {};
    }
}