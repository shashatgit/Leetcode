class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landEndBest = 99999;
        int waterEndBest = 99999;
        int res = 99999;
        int indL = 0; 
        int indW = 0;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for(int i = 0; i < n; i++)
        {
            if (landStartTime[i] + landDuration[i] < landEndBest)
            {
                landEndBest = landStartTime[i] + landDuration[i];
                indL = i;
            }
        }
        for(int i = 0; i < m; i++)
        {
            if (waterStartTime[i] + waterDuration[i] < waterEndBest)
            {
                waterEndBest = waterStartTime[i] + waterDuration[i];
                indW = i;
            }
            res = Math.min(res, Math.max(landEndBest, waterStartTime[i])+ waterDuration[i]);
        }
        for (int i = 0; i < n; i++)
        {
            res = Math.min(res, Math.max(waterEndBest, landStartTime[i])+ landDuration[i]);
        }
        return res;


        /*if(landEndBest < waterEndBest && waterStartTime[indW] <= landEndBest)
        {
            return landEndBest + waterDuration[indW];
        }
        else if (landEndBest < waterEndBest)
        {
            return waterEndBest;
        }
        else if(landEndBest > waterEndBest && waterEndBest >= landStartTime[indL])
        {
            return waterEndBest + landDuration[indL];
        }
        else
        {
            return landEndBest;
        }*/
    }
}