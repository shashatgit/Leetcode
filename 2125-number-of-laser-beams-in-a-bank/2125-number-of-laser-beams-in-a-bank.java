class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int lrc = 0;
        int rc = 0;
        for(int i = 0; i < bank.length; i++)
        {
            rc = 0;
            for(int j = 0; j < bank[0].length(); j++)
            {
                if(bank[i].charAt(j) == '1')
                {
                    rc++;
                }
                
            }
            res += rc*lrc;
            if(rc > 0)
            {
                lrc = rc;
            }
        }
        return res;
    }
}