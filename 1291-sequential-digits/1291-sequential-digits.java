class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int digits_lower = 0;
        int low_start = 0;
        String base = "0123456789";
        ArrayList<Integer> ans = new ArrayList<>();
        int og_low = low;

        while (low > 0) 
        {
            low_start = low % 10;
            low /= 10;
            digits_lower++;
        }

        while (low_start > 10 - digits_lower) 
        {
            digits_lower++;
            low_start = 1;
        }

        for (int i = low_start; i < 11 - digits_lower; i++) 
        {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + digits_lower; j++) 
            {
                sb.append(base.charAt(j));
            }

            int curr = Integer.parseInt(sb.toString());

            if (curr >= og_low) 
            {
                if (curr <= high) ans.add(curr);
                else break;
            }

            if (i == 10 - digits_lower) 
            {
                digits_lower++;

                if (digits_lower > 9)
                    break;

                i = 0;
            }
        }
        return ans;
    }
}