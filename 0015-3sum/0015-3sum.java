class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,k = 0;
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (i = 0; i < nums.length; i++)
        {
            j = i + 1; 
            k = nums.length - 1;
            
            while (k > j){
                if (nums[i] + nums[j] + nums[k] > 0)
                {
                    k--;
                    while (nums[k] != nums[k+1] && k > j)
                    {
                        k--;
                    }
                }
                else if (nums[i] + nums[j] + nums[k] < 0)
                {
                    j++;
                    while (nums[j] != nums[j-1] && k > j)
                    {
                        j++;
                    }
                }
                else
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);


                    result.add(temp);
                    k--;
                    j++;
                    while (nums[k] == nums[k+1] && k > j)
                    {
                        k--;
                    }
                    while (nums[j] == nums[j-1] && k > j)
                    {
                        j++;
                    }
                    
                }
                while (i < nums.length-2 && nums[i] == nums[i+1])
                {
                    i++;
                }
            }
        }
        return result;
    }
}