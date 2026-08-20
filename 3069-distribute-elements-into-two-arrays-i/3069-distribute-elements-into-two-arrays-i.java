class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> uno = new ArrayList<>();
        ArrayList<Integer> dos = new ArrayList<>();
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = 0;
        uno.add(nums[0]);
        dos.add(nums[1]);
        for(int k = 2; k < n; k++)
        {
            if(uno.get(i) > dos.get(j))
            {
                uno.add(nums[k]);
                i++;
            }
            else
            {
                dos.add(nums[k]);
                j++;
            }
        }
        for(int k = 0; k < uno.size(); k++)
        {
            ans[k] = uno.get(k);
        }
        for(int k = 0; k < j+1; k++)
        {
            ans[i+1] = dos.get(k);
            i++;
        }
        return ans;
    }
}