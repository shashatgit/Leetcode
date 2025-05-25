class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> dic = new HashMap<Character,Integer>();
        int i = 0;
        for (i = 0; i < s.length(); i++)
        {
            if (dic.containsKey(s.charAt(i)))
            {
                dic.put(s.charAt(i),dic.get(s.charAt(i))+1);
            }
            else
            {
                dic.put(s.charAt(i),1);
            }
        }
        
        for (i = 0; i < t.length(); i++)
        {
            if (dic.containsKey(t.charAt(i)))
            {
                dic.put(t.charAt(i),dic.get(t.charAt(i))-1);
            }
            else return false;
        }

        for (Map.Entry<Character,Integer> e:dic.entrySet())
        {
            if (e.getValue()!= 0)
            {
                return false;
            }
        }
        return true;
    }
}