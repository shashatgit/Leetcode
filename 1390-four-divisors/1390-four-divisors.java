class Solution {
    public int sumFourDivisors(int[] nums) {
        int count = 0;
        int total = 0;
        for (int i : nums)
        {
            count = 0;
            int sum = 0;
            for(int j = 2; j < i/2; j++)
            {
                if(i%j == 0)
                {
                    sum += j;
                    count++;
                }
                if(count > 2)
                {
                    sum = 0;
                    break;
                }
            }
            if(count == 2) total += sum + i + 1;
            
        }
        return total;
    }
}