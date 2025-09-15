class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        int flag = 0;
        for (char i : brokenLetters.toCharArray())
        {
            hs.add(i);
        }
        for (char i : text.toCharArray())
        {
            if (hs.contains(i))
            {
                flag = 1;
            }
            if (i == ' ')
            {
                if (flag == 0)
                {
                    count++;
                }
                flag = 0;
            }
        }
        if (flag == 0) count++;
        return count;
    }
}