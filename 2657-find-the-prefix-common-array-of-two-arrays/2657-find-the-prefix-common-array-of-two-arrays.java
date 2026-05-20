class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int counter = 0;
        int n = A.length;
        int[] C = new int[n];
        int[] freq = new int[n+1];
        for (int i = 0; i < n; i++)
        {
            freq[A[i]]++;
            if (freq[A[i]] == 2)counter++;

            freq[B[i]]++;
            if (freq[B[i]] ==2)counter++;

            C[i] = counter;
            
        }
        return C;
    }
}