class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> table = new HashMap<>();
        for (int i = 0;  i < s.length(); i++)
        {
            if (table.containsKey(s.charAt(i)))
            {
                if(table.get(s.charAt(i)) == t.charAt(i))
                {
                    continue;
                } 
                else return false;
            }
            else
            {
                if (table.containsValue(t.charAt(i)))
                {
                    return false;
                }
                table.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}