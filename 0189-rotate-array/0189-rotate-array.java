class Solution {
    /*public void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        
    }*/
    public void rotate(int[] nums, int k) {
        int i = 0;
        k = k%nums.length;
        int[] arr = new int[nums.length];
        for (i=0;i<nums.length;i++){
            arr[(i+k)%nums.length] = nums[i];      
        }
        for (i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}