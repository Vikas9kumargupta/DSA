class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = matrix[i - 1][j];
                int left = (j > 0) ? matrix[i - 1][j - 1] : Integer.MAX_VALUE;
                int right = (j < m - 1) ? matrix[i - 1][j + 1] : Integer.MAX_VALUE;

                matrix[i][j] += Math.min(up, Math.min(left, right));
            }
        }

        // Find the minimum path sum in the last row
        int minPathSum = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minPathSum = Math.min(minPathSum, matrix[n - 1][j]);
        }

        return minPathSum;
    }
}