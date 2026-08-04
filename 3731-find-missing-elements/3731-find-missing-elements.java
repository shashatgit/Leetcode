class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = nums[0];
        int ind = 0;
        int j = nums[nums.length-1];
        while(i < j)
        {
            if(nums[ind] != i)
            {
                ans.add(i);
                i++;
            }
            else
            {
                i++;
                ind++;
            }

        }
        return ans;
    }
}