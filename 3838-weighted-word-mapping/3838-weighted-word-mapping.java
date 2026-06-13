class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder("");
        int n = words.length;
        for(int i = 0; i < n; i++)
        {
            int m = words[i].length();
            String s = words[i];
            int sum = 0;
            for(int j = 0; j < m; j++)
            {
                sum += weights[s.charAt(j) - 97];
            }
            sum = sum % 26;
            sum = (26-sum) + 96;
            char ch = (char)sum;
            ans.append(ch);
        }
        return ans.toString();
    }
}