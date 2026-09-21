class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Deque<Long> stk = new ArrayDeque<>();

        for (int x : nums) {
            long val = x;

            while (!stk.isEmpty() && stk.peek() == val) {
                stk.pop();
                val *= 2L;  
            }

            stk.push(val);
        }

        List<Long> ans = new ArrayList<>();
        while (!stk.isEmpty()) {
            ans.add(stk.removeLast());
        }

        return ans;
    }
}