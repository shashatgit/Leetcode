class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[i] += Math.abs(i-j)*(boxes.charAt(j)-'0');
            }    
        }
        return res;
    }
}