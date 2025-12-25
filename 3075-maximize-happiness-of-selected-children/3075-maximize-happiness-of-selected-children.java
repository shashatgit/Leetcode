class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int turn = 0;
        int i = happiness.length - 1;
        while (turn < k)
        {
            sum += Math.max(0,happiness[i] - turn);
            i--;
            turn++;
        }
        return sum;
    }
}