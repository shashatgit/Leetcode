class Solution {
    public int differenceOfSums(int n, int m) {
        int div_sum = 0;
        int ndiv_sum = 0;
        int i = 0;
        for (i = 1; i < n+1; i++)
        {
            if (i % m == 0)
            {
                div_sum = div_sum + i;
            }
            else ndiv_sum = ndiv_sum + i;
        }
        return ndiv_sum-div_sum;
    }
}