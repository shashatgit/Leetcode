class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            hs.add(nums[i]);
        }
        int i = 1;
        while(true)
        {
            if(!hs.contains(k*i)) return k*i;
            i++;
        }
    }
}