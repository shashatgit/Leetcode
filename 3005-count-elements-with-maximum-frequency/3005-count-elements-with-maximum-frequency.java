class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        int max = 0;
        HashMap <Integer, Integer> hm = new HashMap<>();
        for (int i : nums)
        {
            hm.put(i, hm.getOrDefault(i,0) + 1);
            if (hm.get(i) > max)
            {
                max = hm.get(i);
                count = 1;
            }
            else if (hm.get(i) == max)
            {
                count++;
            }
        }
        return count*max;
    }
}