class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2]; 
        int count = 0;
        for (int i : nums)
        {
            if(hs.contains(i))
            {
                ans[count] = i;
                count++;
                if (count == 2) return ans;
            }
            else hs.add(i);
        }
        return ans;
    }
}