class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++)
        {
            String s = Integer.toString(i);
            int n = s.length();
            for(int j = 1; j < n-1; j++)
            {
                char prev = s.charAt(j-1);
                char curr = s.charAt(j);
                char next = s.charAt(j+1);

                if((curr > prev && curr > next) || (curr < prev && curr < next))
                {
                    count++;
                }
            }
        }
        return count;
    }
}