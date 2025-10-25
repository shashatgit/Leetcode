class Solution {
    public int totalMoney(int n) {
        int lastmon = 0;
        int day = 1;
        int count = 1;
        int curr = 1;
        int sum = 0;
        while(count <= n){
            sum += curr;
            if(day == 1)
            {
                lastmon = curr;
            }
            day++;
            curr++;
            if(day > 7)
            {
                day = 1;
                curr = lastmon + 1;
            }
            count++;
        }
        return sum;
    }
}