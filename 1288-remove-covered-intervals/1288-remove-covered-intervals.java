class Solution {
    public int removeCoveredIntervals(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int count = n;
        for(int i = 0; i < n-1; i++)
        {
            if(intervals[i][1] >= intervals[i+1][1])
            {
                count--;
                intervals[i+1][0] = intervals[i][0];
                intervals[i+1][1] = intervals[i][1];
            }
            else if(intervals[i][0] == intervals[i+1][0] && intervals[i][1] < intervals[i+1][1])
            {
                count--;
            }
        }
        return count;
    }
}