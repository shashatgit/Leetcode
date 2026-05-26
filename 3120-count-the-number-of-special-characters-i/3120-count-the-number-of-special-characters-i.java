class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        int n = word.length();
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                if(upper.contains(Character.toUpperCase(ch)) && !lower.contains(ch))
                {
                    count++;
                }
                lower.add(ch);
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                if(lower.contains(Character.toLowerCase(ch)) && !upper.contains(ch))
                {
                    count++;
                }
                upper.add(ch);
            }
        }
        return count;
    }
}