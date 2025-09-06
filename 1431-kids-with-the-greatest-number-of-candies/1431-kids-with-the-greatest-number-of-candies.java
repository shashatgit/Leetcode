class Solution {
    public int findMax(int[] arr)
    {
        int max = arr[0];
        for (int i : arr)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMax(candies);
        List<Boolean> answer = new ArrayList<>();
        for (int i : candies)
        {
            if(i + extraCandies >= max)
            {
                answer.add(true);
            }
            else answer.add(false);
        }
        return answer;
    }
}