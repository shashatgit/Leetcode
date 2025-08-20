class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0;
        int rs = 0;
        int j = nums.length - 1;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            leftSum[i] = ls;
            ls += nums[i];
            rightSum[j] = rs;
            rs += nums[j];
            j--;
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}