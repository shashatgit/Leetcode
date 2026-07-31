class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int sum = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> val = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            freq.put(word.charAt(i), freq.getOrDefault(word.charAt(i), 0)+1);
        }
        ArrayList<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));
        int value = 0;
        for(int i = 0; i < chars.size(); i++)
        {
            if(i%8 == 0) value++;
            val.put(chars.get(i), value);
        }
        for(int i = 0; i < n; i++)
        {
            sum += val.get(word.charAt(i));
        }
        return sum;
    }
}