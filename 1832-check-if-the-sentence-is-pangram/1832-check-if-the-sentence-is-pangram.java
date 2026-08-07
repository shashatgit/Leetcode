class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        if(n < 26) return false;
        int[] freq = new int[26];
        for(int i = 0; i < n; i++)
        {
            freq[sentence.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++)
        {
            if(freq[i] == 0) return false;
        }
        return true;
    }
}