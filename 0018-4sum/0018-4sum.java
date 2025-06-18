class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int i,j,k,l = 0;
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (l = nums.length-1; l>= 3; l--)
        {
            for (i = 0; i < l-2; i++)
            {
                for (j = i+1; j < l-1; j++)
                {
                    for(k = l-1; k > j; k--)
                    {
                        if ((long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l] == target &&)
                        {
                            ArrayList <Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            result.add(temp);
                        }
                        while (nums[k-1] == nums[k] && k > 1)
                        {
                            k--;
                        }
                    }
                    while (nums[j+1]==nums[j] && j < nums.length-2)
                    {
                        j++;
                    }
                }
                while (nums[i+1] == nums[i] && i < nums.length-2)
                {
                    i++;
                }
            }
            while (nums[l-1] == nums[l] && l > 1)
            {
                l--;
            }
        }
        return result;
    }
}