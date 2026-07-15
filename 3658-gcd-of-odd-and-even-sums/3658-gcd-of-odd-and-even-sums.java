class Solution {
    public int gcd(int x, int y)
    {
        if(y == 0) return x;
        return gcd(y,x%y);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i < 2*n-1; i++)
        {
            sumOdd += i;
            i++;
            sumEven += i;
        }
        return gcd(sumOdd, sumEven)+1;
    }
}