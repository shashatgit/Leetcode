public class Solution {
    public int bestClosingTime(String customers) {
        int max = 0, score = 0, best = -1;
        for(int i = 0; i < customers.length(); ++i) {
            if(customers.charAt(i) == 'Y')
            {
                score++;
            }
            else score--;
            if(score > max) {
                max = score;
                best = i;
            }
        }
        return best + 1;
    }
}