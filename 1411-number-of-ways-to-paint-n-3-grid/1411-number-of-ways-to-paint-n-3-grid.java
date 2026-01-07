class Solution {
    public int numOfWays(int n) {
        int mod = 1000000007;
        long twos = 6;
        long threes = 6;

        for (int i = 2; i < n+1; i++)
        {
            long temp = twos;
            twos = (2*twos + 2*threes)%mod;
            threes = (2*temp + 3*threes)%mod;
        }
        return (int)((twos + threes) % mod);
    }
}