class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap <Integer,Integer> psum = new HashMap <>();
        psum.put(0,1);
        for (int i : nums)
        {
            sum = sum + i;
            
            if (psum.containsKey(sum - k))
            {
                int n = psum.get(sum-k);
                count = count + n;
            }
            if (psum.containsKey(sum)){
                int n = psum.get(sum);
                psum.put(sum, n + 1 );
            }
            else psum.put(sum,1);
        }
        return count;
    }
}