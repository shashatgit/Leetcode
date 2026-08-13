class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Character> seen = new ArrayList<>();
        ArrayList<Character> non_unique = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(seen.contains(ch))
            {
                non_unique.add(ch);
            }
            seen.add(ch);
        }
        for(int i = 0; i < n; i++)
        {
            if(!non_unique.contains(s.charAt(i)))
            {
                return i;
            }
        }
        return -1;
    }
}