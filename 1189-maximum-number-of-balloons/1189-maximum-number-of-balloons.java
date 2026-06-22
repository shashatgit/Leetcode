class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        int n = text.length();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            char ch = text.charAt(i);
            if(ch == 'b')
            {
                count[0]++;
            }
            else if(ch == 'a')
            {
                count[1]++;
            }
            else if(ch == 'l')
            {
                count[2]++;
            }
            else if(ch == 'o')
            {
                count[3]++;
            }
            else if(ch == 'n')
            {
                count[4]++;
            }
        }
        count[2] = count[2]/2;
        count[3] = count[3]/2; 
        for(int i = 0; i < 5; i++)
        {
            ans = Math.min(ans, count[i]);
        }
        return ans;
    }
}