class Solution {
    public int sum (int[] arr){
        int sum = 0;
        for (int i : arr)
        {
            sum += i;
        }
        return sum;
    }
    public boolean check (int[] arr, int d, int c){
        int day = 0;
        int sum = 0;
        for (int i : arr)
        {
            if (i > c) return false;
            if ((sum + i) > c)
            {
                sum = 0;
                day++;
            }
            else if ((sum + i) == c)
            {
                sum = 0;
                day++;
                continue;
            }
            sum += i;
        }
        if (sum > 0) day++;
        if (day <= d)
        {
            return true;
        }
        else return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int high = sum(weights);
        int low = 1;
        int ans = high;

        while (high >= low){

            int mid = low + (high - low)/2;

            if (check(weights, days, mid))
            {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}