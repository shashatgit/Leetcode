class Solution {
    public int check(int d, int[] arr){
        int sum = 0;
        for (int i : arr)
        {
            sum += Math.ceil((double)i/d);
        }
        return sum;
    }

    public int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int high = max(nums);
        int low = 1;
        int ans = high;
        while (low <= high)
        {
            int mid = low + (high-low)/2;
            if (check(mid,nums) <= threshold)
            {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}