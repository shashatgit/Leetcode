class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> value = new HashSet<Integer>();
        int i = 0;
        for (i = 0; i < nums.length; i++)
        {
            if (value.contains(nums[i]))
            {
                return true;
            }
            else value.add(nums[i]);
        }
        return false;
    }
}