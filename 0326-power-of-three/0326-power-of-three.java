class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        for (int i = 0; i < 20; i++)
        {
            if (n == Math.pow(3,i))
            {
                return true;
            }
        }
        return false;
    }
}