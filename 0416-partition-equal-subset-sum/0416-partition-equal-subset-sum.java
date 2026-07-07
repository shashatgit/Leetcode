class Solution {
    int[][] dp;

    public boolean check(int[] arr, int n, int target) {
        if (target == 0) return true;

        if (dp[n][target] != -1)
            return dp[n][target] == 1;

        if (n == 0) {
            dp[0][target] = (arr[0] == target) ? 1 : 0;
            return dp[0][target] == 1;
        }

        boolean notTake = check(arr, n - 1, target);

        boolean take = false;
        if (arr[n] <= target) {
            take = check(arr, n - 1, target - arr[n]);
        }

        dp[n][target] = (take || notTake) ? 1 : 0;
        return dp[n][target] == 1;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) == 1) return false;

        int target = sum / 2;
        int n = nums.length;

        dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return check(nums, n - 1, target);
    }
}