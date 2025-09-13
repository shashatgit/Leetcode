class Solution {
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    public int maxFreqSum(String s) {
        int vmax = 0;
        int cmax = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(isVowel(ch)){
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                vmax = Math.max(hm.get(ch),vmax);
            }
            else
            {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                cmax = Math.max(hm.get(ch),cmax);
            }
        }
        return vmax+cmax;
    }
}