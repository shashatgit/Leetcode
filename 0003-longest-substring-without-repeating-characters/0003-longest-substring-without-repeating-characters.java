class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            char todo = s.charAt(i);
            map.put(todo, map.getOrDefault(todo, 0) + 1);
            while (map.get(todo) > 1)
            {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) -1);
                left++;
            }

            max = Math.max(max, i - left + 1);

        }
        return max;
    }
}