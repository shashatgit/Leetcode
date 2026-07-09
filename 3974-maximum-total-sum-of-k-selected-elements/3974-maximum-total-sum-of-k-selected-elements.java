class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length;
        for(int i = n-1; i >= 0; i--)
        {
            long ele = nums[i];
            long toMul = mul;
            if (k == 0) break;
            k--;
            if(mul > 1)
            {
                sum += ele * toMul;
                mul--;
            }
            else sum += ele;
        }
        return sum;
    }
}