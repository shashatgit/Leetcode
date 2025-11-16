class Solution {
    public int numSub(String s) {
        long cont = 0;
        long res = 0;
        long mod = 1000000007;
        long n = s.length();
        for (int i = 0; i < n; i++)
        {
            if(s.charAt(i) == '1')
            {
                cont++;
                res = (res + cont) % mod;
            }
            else cont = 0;
            
        }
        return (int)res;
    }
}