class Solution {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder("");
        Stack <String> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                continue;
            }
            else 
            {
                StringBuilder word = new StringBuilder("");
                while (i < s.length() && s.charAt(i) != ' ')
                {
                    word.append(s.charAt(i));
                    i++;
                }
                word.append(" ");
                stk.push(word.toString());
            }
        }
        while (!stk.isEmpty())
        {
            answer.append(stk.pop());
        }
        answer.deleteCharAt(answer.length() - 1);
        return answer.toString();
    }
}