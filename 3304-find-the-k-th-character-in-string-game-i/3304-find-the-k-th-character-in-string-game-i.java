class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        int count = 0;
        double log = Math.log(k)/Math.log(2);
        int iteration = (int)Math.ceil(log);
        while (iteration >= count){
            int len = str.length();
            char[] temp = new char[len];
            for (int i = 0; i < len; i++)
            {
                char x = str.charAt(i);
                x += 1;
                temp[i] = x;
            }
            String add = new String(temp);
            str.append(add);
            count++;
        }
        return str.charAt(k-1);
    }
}