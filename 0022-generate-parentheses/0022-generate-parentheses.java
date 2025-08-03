class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        generate(answer, "", n, n);
        return answer;
    }

    public void generate (List<String> result, String s, int open, int close) {
        
        if (open == 0 && close == 0)
        {
            result.add(s);
            return;
        }
        if (open != 0)
        {
            generate(result,s+'(', open-1, close);
        }
        if (close > open)
        {
            generate(result,s+')', open, close-1);
        }
    } 
}