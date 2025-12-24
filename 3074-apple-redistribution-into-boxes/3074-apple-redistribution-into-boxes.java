class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        int pack = 0;
        int count = 0;
        int n = capacity.length - 1;
        Arrays.sort(capacity);
        for(int i : apple)
        {
            sum+=i;
        }
        int i = n;
        while(pack < sum)
        {
            pack+=capacity[i];
            i--;
            count++;
        }
        return count;
    }
}