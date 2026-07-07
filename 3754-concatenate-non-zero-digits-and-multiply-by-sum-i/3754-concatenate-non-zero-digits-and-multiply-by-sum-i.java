class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        long sum = 0;
        String num = String.valueOf(n);
        int k = num.length();
        for(int i = 0; i < k; i++)
        {
            char ch = num.charAt(i);
            if (ch == '0')
            {
                continue;
            }
            else
            {
                ans = ans*10 + (ch - '0');
                sum += (ch - '0');
            }
        }

        return sum*ans;
    }
}