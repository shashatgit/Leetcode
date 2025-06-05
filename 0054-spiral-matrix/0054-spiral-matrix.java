class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> output = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int rows = 0, rowe = m - 1;
        int cols = 0, cole = n - 1;

        while (output.size() < m * n) {
            
            for (int j = cols; j <= cole && output.size() < m * n; j++) {
                output.add(matrix[rows][j]);
            }
            rows++;

            
            for (int i = rows; i <= rowe && output.size() < m * n; i++) {
                output.add(matrix[i][cole]);
            }
            cole--;

            
            for (int j = cole; j >= cols && output.size() < m * n; j--) {
                output.add(matrix[rowe][j]);
            }
            rowe--;

            
            for (int i = rowe; i >= rows && output.size() < m * n; i--) {
                output.add(matrix[i][cols]);
            }
            cols++;
        }

        return output;
    }
}
