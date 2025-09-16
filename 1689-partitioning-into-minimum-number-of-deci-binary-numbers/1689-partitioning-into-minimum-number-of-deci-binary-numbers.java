class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (char c : n.toCharArray()) {
            maxDigit = Math.max(maxDigit, c - '0');
        }
        return maxDigit;
    }
}
