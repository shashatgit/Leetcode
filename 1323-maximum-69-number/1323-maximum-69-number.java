class Solution {
    public int maximum69Number (int num) {
        int index = -1;
        int itr = 0;
        int temp = num;
        while (temp > 0)
        {
            if (temp%10 == 6) index = itr;

            itr++;
            temp = temp/10;
        }
        if (index == -1) return num;
        num = num + (int)(3 * Math.pow(10,index));
        return num;
    }
}