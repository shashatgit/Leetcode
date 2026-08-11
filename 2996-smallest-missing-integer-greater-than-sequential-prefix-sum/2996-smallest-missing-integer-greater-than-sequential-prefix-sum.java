class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int ind = 1;
        HashSet<Integer> hs = new HashSet<>();
        while(ind < n && nums[ind] == nums[ind-1]+1)
        {
            sum += nums[ind];
            ind++;
        }
        for(int i = 0; i < n; i++)
        {
            hs.add(nums[i]);
        }
        while(true)
        {
            if(!hs.contains(sum)) return sum;
            else sum++;
        }
    }
}