class Solution {
    public int lessThanGoal(int[] nums, int goal)
    {
        int head, tail = 0, sum = 0, result = 0;
        for (head = 0; head < nums.length; head++) {
            sum += nums[head];
            while (sum > goal && tail <= head) {
                sum -= nums[tail];
                tail++;
            }
            result += head - tail + 1;
        }
        return result;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] % 2;
        }

        return lessThanGoal(nums,k) - lessThanGoal(nums,k-1);
    }
}