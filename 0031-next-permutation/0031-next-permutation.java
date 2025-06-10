class Solution {
    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void reverseArray(int[] arr, int p, int q) {
        while (q > p) {
            swap(arr, p++, q--);
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }

        if (breakpoint == -1) {
            reverseArray(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > breakpoint; i--) {
            if (nums[i] > nums[breakpoint]) {
                swap(nums, i, breakpoint);
                break;
            }
        }

        reverseArray(nums, breakpoint + 1, n - 1);
    }
}
