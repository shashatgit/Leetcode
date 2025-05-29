class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> single = new HashSet<>();

        for (int i : nums){
            if (!single.contains(i))
            {
                single.add(i);
            }
            else single.remove(i);
        }
        for (Integer i : single)
        {
            return i;
        }
        return -1;
    }
}