class Solution {
    public int prodDigits(int n)
    {
        int p = 1;
        while(n > 0)
        {
            p = n%10 * p;
            n = n/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        int i = n;
        while(true)
        {
            int prod = prodDigits(i);
            if(prod % t == 0) return i;
            i++;
        }
    }
}