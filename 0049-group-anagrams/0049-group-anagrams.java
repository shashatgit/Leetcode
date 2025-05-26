import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> groups = new HashMap<>();
        int i = 0;
        
        for (i = 0; i < strs.length; i++) {
            char[] check = strs[i].toCharArray();
            Arrays.sort(check);
            String key = new String(check);  

            if (groups.containsKey(key)) {
                groups.get(key).add(strs[i]);  
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                groups.put(key, newGroup);     
            }
        }
        for (Map.Entry<String, List<String>> entry : groups.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
