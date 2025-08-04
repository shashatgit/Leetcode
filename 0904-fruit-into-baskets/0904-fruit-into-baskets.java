class Solution {
    public int totalFruit(int[] fruits) {
        int max_window = 0;

        for (int i = 0; i < fruits.length; i++) {
            HashSet<Integer> occ = new HashSet<>();
            int count = 0;

            for (int j = i; j < fruits.length; j++) {
                if (occ.contains(fruits[j]) || occ.size() < 2) {
                    occ.add(fruits[j]);
                    count++;
                } else {
                    break;
                }
            }

            max_window = Math.max(max_window, count);
        }

        return max_window;
    }
}
