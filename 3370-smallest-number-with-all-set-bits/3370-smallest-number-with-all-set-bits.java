class Solution {
    public int smallestNumber(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
            sb.append(1);
            n = n >> 1;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}