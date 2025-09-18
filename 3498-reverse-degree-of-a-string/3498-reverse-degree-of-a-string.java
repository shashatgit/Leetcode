class Solution {
    public int reverseDegree(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int value = (int)s.charAt(i);
            value = value - 97;
            answer = answer + (26 - value)*(i+1);
        }
        return answer;
    }
}