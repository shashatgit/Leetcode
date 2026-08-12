class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int maxLen = 0;
        int l = 0;
        int r = 0;
        while(l < n && r < n)
        {
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            if(map.get(nums[r]) > k)
            {
                while(map.get(nums[r]) > k)
                {
                    map.put(nums[l], map.getOrDefault(nums[l], 0)-1);
                    l++;
                }
            }
            maxLen = Math.max(r-l+1, maxLen);
            r++;
        }
        return maxLen;
    }
}