class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, int[]> map = new HashMap<>();

        for (int[] seat : reservedSeats) {

            int row = seat[0];
            int col = seat[1];

            if (!map.containsKey(row)) {
                map.put(row, new int[3]);
            }

            int[] blocks = map.get(row);

            if (col == 2 || col == 3) {
                blocks[0] = 1;
            }
            else if (col == 4 || col == 5) {
                blocks[0] = 1;
                blocks[1] = 1;
            }
            else if (col == 6 || col == 7) {
                blocks[1] = 1;
                blocks[2] = 1;
            }
            else if (col == 8 || col == 9) {
                blocks[2] = 1;
            }
        }

        int count = (n - map.size()) * 2;

        for (int[] blocks : map.values()) {

            if (blocks[0] == 0 && blocks[2] == 0) {
                count += 2;
            }
            else if (blocks[0] == 0 || blocks[1] == 0 || blocks[2] == 0) {
                count++;
            }
        }

        return count;
    }
}