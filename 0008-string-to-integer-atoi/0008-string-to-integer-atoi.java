class Solution {

    long num = 0;
    int flag = 0;
    boolean started = false;

    public void Atoi(String s, int i){
        if (i == s.length()) return;

        char c = s.charAt(i);

        if (!started && c == '-') {
            flag = 1;
            started = true;
        }
        else if (!started && c == '+') {
            started = true;
        }
        else if (c >= '0' && c <= '9') {
            started = true;
            num = num * 10 + (c - '0');

            
            if (flag == 0 && num > Integer.MAX_VALUE) return;
            if (flag == 1 && -num < Integer.MIN_VALUE) return;
        }
        else {
            return; 
        }

        Atoi(s, i + 1);
    }

    public int myAtoi(String s) {
        int init = 0;

        
        while (init < s.length() && s.charAt(init) == ' ') {
            init++;
        }
        if (init == s.length()) return 0;

        String toPass = s.substring(init);
        Atoi(toPass, 0);

        long result = flag == 0 ? num : -num;

        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }
}
