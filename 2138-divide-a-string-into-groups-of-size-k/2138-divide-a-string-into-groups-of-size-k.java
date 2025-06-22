class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = (int)s.length();
        int groups = len/k;
        if (len%k != 0)
        {
            groups++;
        }

        
        String [] result = new String[groups];
        int i = 0;
        int count = 0;
        while (i+k-1 < len)
        {
            String temp = s.substring(i,i+k);
            result[count] = temp;
            i = i + k;
            count++;
        }
        if (len%k != 0)
        {
            for (i = 0 ; i < k-(len%k); i++)
            {
                String filler = String.valueOf(fill);
                s = s + filler;
            }
            String temp = s.substring((groups-1) * 3,groups*3);
            result[count] = temp;

        }
        return result;
    }
}