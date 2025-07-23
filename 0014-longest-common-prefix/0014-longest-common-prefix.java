class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(),last.length()); i++)
        {
            if (first.charAt(i) == last.charAt(i))
            {
                sb.append(first.charAt(i));
            }
            else return sb.toString();
        }
        return sb.toString();
    }
}