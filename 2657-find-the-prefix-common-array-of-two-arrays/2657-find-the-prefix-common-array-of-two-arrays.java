class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int counter = 0;
        HashSet<Integer> a_a = new HashSet<>();
        HashSet<Integer> b_a = new HashSet<>();
        int n = A.length;
        int[] C = new int[n];
        for (int i = 0; i < n; i++)
        {
            int a = A[i];
            int b = B[i];
            if (a == b) counter--;
            a_a.add(a);
            b_a.add(b);
            if(b_a.contains(a)) counter++;
            if(a_a.contains(b)) counter++;
            C[i] = counter;
        }
        return C;
    }
}