class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int check = target-nums[i];
            if (set.containsKey(check))
            {
                int pair_index = set.get(check);
                int[] res = {pair_index, i};
                return res;
            }
            set.put(nums[i],i);
        }
        return new int[] {};
    }
}