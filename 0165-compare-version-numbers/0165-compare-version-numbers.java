class Solution {
    public int compareVersion(String version1, String version2) {
        int num1, num2;
        int flag = 0, i = 0, j = 0;
        int len1 = version1.length();
        int len2 = version2.length();

        while (i < len1 && j < len2)
        {
            num1 = 0;
            num2 = 0;
            while (i < len1 && version1.charAt(i) != '.')
            {
                char x = version1.charAt(i);
                if (flag == 0 && x =='0')
                {
                    i++;
                    continue;
                }
                else 
                {
                    flag = 1;
                    num1 = num1*10 + (x - '0');
                    i++;
                }
            }
            flag = 0;
            while (j < len2 && version2.charAt(j) != '.')
            {
                char x = version2.charAt(j);
                if (flag == 0 && x =='0')
                {
                    j++;
                    continue;
                }
                else 
                {
                    flag = 1;
                    num2 = num2*10 + (x - '0');
                    j++;
                }
            }
            if (num1 < num2) return -1;
            else if (num1 > num2) return 1;
            
            i++;
            j++;
        }
        i--;
        j--;
        if (j == len2)
        {
            for (i = i+1; i < len1; i++)
            {
                if (version1.charAt(i) != '.' && version1.charAt(i) != '0')
                {
                    return 1;
                }

            }
        }
        else if (i == len1)
        {
            for (j = j+1; j < len2; j++)
            {
                if (version2.charAt(j) != '.' && version2.charAt(j) != '0')
                {
                    return -1;
                }
            }
        }
        return 0;
    }
}