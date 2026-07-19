class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> freq = new HashMap<>();
        HashSet<Character> isTaken = new HashSet<>();
        Deque<Character> stk = new ArrayDeque<>();
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(stk.isEmpty()) 
            {
                stk.push(ch);
                freq.put(ch, freq.get(ch) - 1);
                isTaken.add(ch);
                continue;
            }
            freq.put(ch, freq.get(ch) - 1);
            if(isTaken.contains(ch)) continue;

            while(!stk.isEmpty())
            {
                if(stk.peek() <= ch) break;
                if(freq.get(stk.peek()) == 0) break;

                isTaken.remove(stk.peek());
                stk.pop();
            }
            stk.push(ch);
            isTaken.add(ch);
        }
        while(!stk.isEmpty())
        {
            ans.append(stk.removeLast());
        }
        return ans.toString();
    }
}