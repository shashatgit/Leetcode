class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        int empty = 0;
        while (numBottles + empty >= numExchange)
        {
            count += numBottles;
            empty += numBottles;
            numBottles = empty/numExchange;
            empty = empty%numExchange;
        }
        count += numBottles;
        return count;
    }
}