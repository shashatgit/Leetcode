class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < (1<<n); i++)
        {
            List<Integer> set = new ArrayList<>();
            for (int j = 0; j < n; j++)
            {
                if ((i & (1<<j)) != 0)
                {
                    set.add(nums[j]);
                }
            }
            result.add(set);
        }
        return result;
    }
}