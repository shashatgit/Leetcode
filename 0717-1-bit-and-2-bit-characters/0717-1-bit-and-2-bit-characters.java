class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int ones = 0;
        int n = bits.length;
        for (int i = n-2; i >= 0; i--)
        {
            if(bits[i] == 0) break;
            else ones++;
        }
        if (ones % 2 > 0) return false;
        return true;
    }
}