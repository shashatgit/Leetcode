class Solution {
    public int max (int [] nums){
        int max = nums[0];
        for (int i:nums){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public boolean check(int[] nums, int k, int s){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > s){
                return false;
            }
            if (sum + nums[i] > s){
                count++;
                sum = nums[i];
            }
            else sum += nums[i];
        }
        if (count + 1 <= k){
            return true;
        }
        return false;
    }
    public int sum (int[] nums){
        int sum = 0;
        for (int i : nums){
            sum += i;
        }
        return sum;
    }
    public int splitArray(int[] nums, int k) {
        int high = sum(nums);
        int low = max(nums);
        int ans = high;

        while (low <= high)
        {
            int mid = low + (high-low)/2;
            if (check(nums, k, mid))
            {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}