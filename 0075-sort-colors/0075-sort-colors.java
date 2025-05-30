class Solution {
    public void sortColors(int[] nums) {
        int[] arr = {0,0,0};
        int p = 0;
        for (int i : nums){
            arr[i]++;
        }
        if (arr[0]!=0)
        {
            for (int i = 0; i < arr[0]; i++)
            {
                nums[i] = 0;
                
            }
        }
        if (arr[1]!=0){
            for (int i = arr[0]; i < arr[0] + arr[1]; i++)
            {
                nums[i] = 1;
            }
        }
        p += arr[1];
        if (arr[2]!=0){
            for (int i = arr[0]+arr[1]; i < nums.length; i++)
            {
                nums[i] = 2;
            }
        }
    }
}