class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cont = 0;
        int max = 0;
        for (int i : nums)
        {
            if (i == 0) 
            {
                max = Math.max(cont, max);
                cont = 0;
            }
            else cont++;
            max = Math.max(cont, max);

        }
        return max;
    }
}