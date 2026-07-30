class Solution {
    public int minimumPushes(String word) {
        int length = word.length();
        if(length < 9)
        {
            return length;
        }
        else if(length < 17)
        {
            return 8 + (length-8)*2;
        }
        else if(length < 25)
        {
            return 24 + (length-16)*3;
        }
        else return 48 + (length - 24)*4;
    }
}