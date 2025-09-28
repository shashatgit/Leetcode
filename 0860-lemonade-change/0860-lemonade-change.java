class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;

        for (int i : bills)
        {
            if (i == 5)
            {
                five++;
            }
            else if(i == 10)
            {
                ten++;
                five--;
            }
            else
            {
                twenty++;
                if (ten == 0)
                {
                    five--;
                    five--;
                    five--;
                }
                else
                {
                    ten--;
                    five--;
                }
            }
            if (!(five >= 0 && ten >= 0 && twenty >=0))
            {
                return false;
            }
        }
        return true;
    }
}