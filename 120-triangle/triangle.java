class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return solve(0, 0, triangle, dp);
    }

    public int solve(int i, int j, List<List<Integer>> triangle, int[][] dp) {

        // Base case: last row
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }

        // Already calculated
        if (dp[i][j] != Integer.MIN_VALUE) {
            return dp[i][j];
        }

        // Two choices
        int left = solve(i + 1, j, triangle, dp);
        int right = solve(i + 1, j + 1, triangle, dp);

        // Store answer
        dp[i][j] = triangle.get(i).get(j) + Math.min(left, right);

        return dp[i][j];
    }
}