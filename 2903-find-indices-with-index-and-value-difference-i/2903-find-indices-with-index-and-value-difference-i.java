class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

        int len = nums.length;

        for (int i = 0; i < len - indexDifference; i++) {

            int numI = nums[i];

            for (int j = i + indexDifference; j < len; j++) {

                int diff = numI - nums[j];

                if (diff >= valueDifference || diff <= -valueDifference) {

                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}