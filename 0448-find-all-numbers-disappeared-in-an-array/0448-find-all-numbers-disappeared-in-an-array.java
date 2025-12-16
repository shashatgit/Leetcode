class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<Integer> ls = new ArrayList<>();
        int find = 1;
        for (int i = 0; i < n; i++)
        {
            if(nums[i] < find && i == n-1 && find <= n)
            {
                ls.add(find);
            }
            if (nums[i] == find)
            {
                find++;
            }
            if(nums[i] > find)
            {
                ls.add(find);
                find++;
                i--;
            }
        }
        return ls;
    }
}