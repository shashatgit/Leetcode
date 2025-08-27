class Solution {
    public int numberOfSubstrings(String s) {
        int als = -1;
        int bls = -1;
        int cls = -1;
        int ans = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a')
            {
                als = i;
            }
            else if (s.charAt(i) == 'b')
            {
                bls = i;
            }
            else
            {
                cls = i;
            }

            if (als != -1 && bls != -1 && cls != -1)
            {
                int init = Math.min(als,Math.min(bls,cls));
                ans = ans + init + 1;
            }
        }
        return ans;

    }
}