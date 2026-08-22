class Solution {
    public boolean checkDivisibility(int n) {
        int p = 1;
        int s = 0;
        int temp = n;
        while(temp > 0)
        {
            p = p * (temp%10);
            s = s + (temp%10);
            temp = temp/10;
        }
        return ((n%(p+s)) == 0);
    }
}