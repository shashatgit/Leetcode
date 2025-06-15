class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> freq = new HashMap<>();
        ArrayList <Integer> result = new ArrayList<>();
        for (int i : nums)
        {
            if (freq.containsKey(i))
            {
                int occ = freq.get(i);
                freq.put(i,occ+1);
            }
            else freq.put(i,1);
        }
        for (Map.Entry <Integer,Integer> e : freq.entrySet())
        {
            if(e.getValue() > nums.length/3)
            {
                result.add(e.getKey());
                if (result.size() == 2)
                {
                    return result;
                }
            }
        }
        return result;
    }
}