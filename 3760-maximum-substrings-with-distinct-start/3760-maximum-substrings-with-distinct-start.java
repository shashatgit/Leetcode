class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            char c = s.charAt(i);
            if (!hs.contains(c)){ 
                hs.add(c);
                count++;
            }
        }
        return count;
    }
}