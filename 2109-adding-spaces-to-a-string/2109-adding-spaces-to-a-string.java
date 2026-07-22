class Solution {
    public String addSpaces(String s, int[] spaces) {
        int offset = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        while (i-offset < n && j < spaces.length)
        {
            if(i == spaces[j] + offset)
            {
                sb.append(' ');
                offset++;
                j++;
            }
            else
            {
                sb.append(s.charAt(i-offset));
            }
            i++;
        }
        if(i-offset < n)
        {
            sb.append(s.substring(i-offset,n));
        }
        return sb.toString();
    }
}