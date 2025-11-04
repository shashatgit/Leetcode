class Solution {
    public String intToRoman(int num) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        if (num/1000 >= 1)
        {
            int th = num/1000;
            while (count < th)
            {
                sb.append("M");
                count++;
            }
            num = num - count*1000;
        }
        if (num/100 == 9)
        {
            sb.append("CM");
            num = num - 900;
        }
        else if (num/100 >= 5)
        {
            sb.append("D");
            num = num - 500;
        }
        else if (num/100 == 4)
        {
            sb.append("CD");
            num = num - 400;
        }
        if(num/100 >= 1)
        {
            count = 0;
            int th = num/100;
            while (count < th)
            {
                sb.append("C");
                count++;
            }
            num = num - count*100;
        }
        if (num/10 == 9)
        {
            sb.append("XC");
            num = num - 90;
        }
        else if (num/10 >= 5)
        {
            sb.append("L");
            num = num - 50;
        }
        else if (num/10 == 4)
        {
            sb.append("XL");
            num = num - 40;
        }
        if(num/10 >= 1)
        {
            count = 0;
            int th = num/10;
            while (count < th)
            {
                sb.append("X");
                count++;
            }
            num = num - count*10;
        }
        if (num == 9)
        {
            sb.append("IX");
            num = num - 9;
        }
        else if (num >= 5)
        {
            sb.append("V");
            num = num - 5;
        }
        else if (num == 4)
        {
            sb.append("IV");
            num = num - 4;
        }
        if(num >= 1)
        {
            count = 0;
            int th = num/1;
            while (count < th)
            {
                sb.append("I");
                count++;
            }
            num = num - count;
        }
        return sb.toString();
    }
}