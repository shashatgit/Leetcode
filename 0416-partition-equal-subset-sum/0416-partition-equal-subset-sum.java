class Solution {
    int sum = 0;
    int[][] dp;
    public boolean check(int[] arr, int n, int target)
    {
        if (target < 0) return false;
        if (target == 0) return true;
        if (n == 0) return arr[0] == target;
        if(dp[n][target] != -1) return dp[n][target] == 1;
        boolean notTake = check(arr, n - 1, target);
        boolean take = check(arr, n - 1, target - arr[n]);
        if(take || notTake == true) dp[n][target] = 1;
        else dp[n][target] = 0;
        return (take || notTake);
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        for(int i : nums)
        {
            sum += i;
        }
        dp = new int[n][sum/2 + 1];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        if(sum % 2 != 0) return false;
        return check(nums, n - 1, sum/2);
    }
}