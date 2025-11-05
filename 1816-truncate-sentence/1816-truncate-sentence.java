class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int i = 0;
        while (count < k && i < s.length())
        {
            if(s.charAt(i) == ' ') count++;
            i++;
        }
        if(i == s.length()) return s.substring(0,i);
        return s.substring(0,i-1);
    }
}