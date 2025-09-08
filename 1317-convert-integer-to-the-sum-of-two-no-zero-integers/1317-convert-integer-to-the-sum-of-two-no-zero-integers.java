class Solution {
    public boolean nonZero(int n)
    {
        return Integer.toString(n).indexOf('0') == -1;
    }
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (nonZero(i) && nonZero(n - i)) {
                return new int[]{i, n - i};
            }
        }
        return new int[]{-1,-1};
    }
}