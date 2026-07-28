class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        char oddChar = '.';

        for(int i = 0; i < n; i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++)
        {
            if(freq[i] % 2 == 0)
            {
                freq[i] = freq[i]/2;
            }
            else
            {
                oddChar = (char)(i + 97);
                freq[i]--;
                freq[i]/=2;
            }
            char ch = (char)(i + 97);
            while(freq[i] > 0)
            {
                ans.append(ch);
                freq[i]--;
            }
        }
        String rev = new StringBuilder(ans).reverse().toString();

        if(oddChar != '.')
        {
            ans.append(oddChar);
        }
        ans.append(rev);
        return ans.toString();
    }
}