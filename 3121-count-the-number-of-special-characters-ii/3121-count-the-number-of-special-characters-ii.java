class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> failed = new HashSet<>();
        int n = word.length();
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                if(upper.contains(Character.toUpperCase(ch)) && lower.contains(ch) && !failed.contains(ch))
                {
                    count--;
                    failed.add(ch);
                }
                else if(!upper.contains(Character.toUpperCase(ch)) && !lower.contains(ch))
                {
                    lower.add(ch);
                }
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