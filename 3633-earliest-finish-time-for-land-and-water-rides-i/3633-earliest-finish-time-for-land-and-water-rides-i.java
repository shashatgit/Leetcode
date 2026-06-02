class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landEndBest = 99999;
        int waterEndBest = 99999;
        int res = 99999;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for(int i = 0; i < n; i++)
        {
            landEndBest = Math.min(landEndBest, landStartTime[i] + landDuration[i]);   
        }
        for(int i = 0; i < m; i++)
        {
            waterEndBest = Math.min(waterEndBest, waterStartTime[i] + waterDuration[i]);
            res = Math.min(res, Math.max(landEndBest, waterStartTime[i])+ waterDuration[i]);
        }
        for (int i = 0; i < n; i++)
        {
            res = Math.min(res, Math.max(waterEndBest, landStartTime[i])+ landDuration[i]);
        }
        return res;
    }
}