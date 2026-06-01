class Solution {
    public int partitionString(String s) {
        int count = 0;
        int curr = 0;
        int n = s.length();
        while (curr < n - 1)
        {
            HashSet<Character> hs = new HashSet<>();
            for(int i = curr; i < n; i++)
            {
                char ch = s.charAt(i);
                curr = i;
                if(hs.contains(ch))
                {
                    count++;
                    break;
                }
                hs.add(ch);
            }
        }
        return count + 1;
    }
}