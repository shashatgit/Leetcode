class Solution {
    public void swap (int arr[], int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        for(i = nums.length-2; i >= 0 ; i--){
            if (nums[i] == 0)
            {
                int temp = i;
                while (temp + 1 < nums.length && nums[temp + 1] != 0) {
                    swap(nums, temp, temp + 1);
                    temp++;
                }
            }
        }
    }
}