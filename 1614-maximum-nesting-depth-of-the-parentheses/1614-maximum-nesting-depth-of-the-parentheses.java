class Solution {
    public int maxDepth(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == '(') stk.push('(');
            else if(s.charAt(i) == ')') stk.pop();
            ans = Math.max(ans, stk.size());
        }
        return ans;
    }
}