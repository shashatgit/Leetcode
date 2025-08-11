class Solution {
    public int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public int minBitFlips(int start, int goal) {
        int sol = start ^ goal;
        int flips = countSetBits(sol);
        return flips;
    }
}