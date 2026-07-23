class Solution {
    public List<Integer> findLonely(int[] nums) {
        int n = nums.length;
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> lonely = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            if(seen.contains(nums[i]))
            {
                lonely.remove(nums[i]);
            }
            else if(!seen.contains(nums[i] - 1) && !seen.contains(nums[i] + 1))
            {
                lonely.add(nums[i]);
            }
            seen.add(nums[i]);
            lonely.remove(nums[i] - 1);
            lonely.remove(nums[i] + 1);
        }
        List<Integer> answer = new ArrayList<>(lonely);
        return answer;
    }
}