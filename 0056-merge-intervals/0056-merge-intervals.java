class Solution {
    public int[][] merge(int[][] intervals) {
        
        if (intervals.length < 2)
        {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int overlap = 0;
        
        for (int i = 0; i < intervals.length-1; i++)
        {
            if (intervals[i][1] >= intervals[i+1][0])
            {
                overlap++;
                intervals[i+1][0] = Math.min(intervals[i][0],intervals[i+1][0]);
                intervals[i][0] = intervals[i+1][0];
                intervals[i+1][1] = Math.max(intervals[i][1],intervals[i+1][1]);

            }
        }
        int j = intervals.length - overlap;
        int [][] res = new int [j][2];
        
        for (int i = intervals.length-1; i >= 0; i--)
        {
            res[j-1] = intervals[i];
            j--;
            if (j==0)
            {
                break;
            }
            if (i > 0)
            {
                while(intervals[i][0] == intervals[i-1][0] || intervals[i][1] == intervals[i-1][1])
                {
                    i--;
                }
            }
            
        }
        
        return res;
    }
}