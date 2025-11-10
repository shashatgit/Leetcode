class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int j = 0;
        HashSet<Integer> hs = new HashSet<>();
        int[] res = new  int[n];
        for(int i : friends)
        {
            hs.add(i);
        }
        for (int i : order)
        {
            if(hs.contains(i)){
                res[j] = i;
                j++;
            }
            if(j == n) break;
        }
        return res;
    }
}