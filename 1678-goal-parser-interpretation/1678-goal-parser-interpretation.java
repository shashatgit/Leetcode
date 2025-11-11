class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder("");
        int n = command.length();
        for (int i = 0; i < n; i++)
        {
            if (command.charAt(i) == 'G') sb.append('G');
            else if (command.charAt(i) == '(')
            {
                if(command.charAt(i+1) == ')'){
                    sb.append('o');
                    i++;
                }
                else{
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}