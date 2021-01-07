package LeetCode;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] DP = new int[n][m];
        // DP[i][j] = DP[i-1][j] + DP[i][j-1]

        for (int i = 0; i < m; i++) {
            DP[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            DP[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                DP[i][j] = DP[i-1][j] + DP[i][j-1];
            }
        }
        return DP[n-1][m-1];
    }
}
