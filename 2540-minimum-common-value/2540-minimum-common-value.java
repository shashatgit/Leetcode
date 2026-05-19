class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int lj = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = lj; j < m; j++)
            {
                int ic = nums1[i];
                int jc = nums2[j];
                if (ic > jc)
                {
                    continue;
                }
                else if (ic < jc)
                {
                    lj = j;
                    break;
                }
                else
                {
                    return ic;
                }
            }
        }
        return -1;
    }
}