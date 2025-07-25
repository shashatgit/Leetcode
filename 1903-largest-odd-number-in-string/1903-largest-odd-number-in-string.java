class Solution {
    public String largestOddNumber(String num) {
        /*int window = num.length();
        int lastIndex = window - 1;
        int count = 1;
        while (window > 0)
        {
            for (int i = 0; i < count; i++)
            {
                String toCheck = num.substring(i,i + window);
                if (toCheck % 2 != 0) return toCheck;
            }
            window--;
            count++;
        }
        return "";
        */

        int lastIndex = num.length() - 1;
        for (int i = lastIndex; i >= 0; i--)
        {
            char toCheck = num.charAt(i);
            if ((toCheck - 0) % 2 != 0)
            {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}