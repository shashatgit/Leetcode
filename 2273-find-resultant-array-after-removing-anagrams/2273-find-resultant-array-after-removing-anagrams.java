import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> answer = new ArrayList<>();
        String toCheck = "";
        
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!sortedWord.equals(toCheck)) {
                answer.add(word);
                toCheck = sortedWord;
            }
        }
        
        return answer;
    }
}
