package LeetCode;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 转置
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row]= temp;
            }
        }
        // 每一行翻转
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n/2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][n-1-col];
                matrix[row][n-1-col]= temp;
            }
        }
    }
}
