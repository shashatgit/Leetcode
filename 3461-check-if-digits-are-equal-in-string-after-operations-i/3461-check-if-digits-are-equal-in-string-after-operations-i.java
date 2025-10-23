class Solution {
    public boolean hasSameDigits(String s) {
        String res = "";
        int i = 0;
        while(s.length() > 2 && i < s.length() - 1)
        {
            res += (char) ((((s.charAt(i) - '0')  + (s.charAt(i + 1) - '0'))%10) + '0');
            i++;
            if (i == s.length() - 1)
            {
                i = 0;
                s = res;
                res = "";
            }
        }
        return s.length() == 2 && s.charAt(0) == s.charAt(1);
    }
}