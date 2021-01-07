package LeetCode;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                if (grid[i][j]==1) {
                    sum = 4;
                    if (grid[i][j-1]==1) { sum--; }
                    if (grid[i][j+1]==1) { sum--; }
                    if (grid[i-1][j]==1) { sum--; }
                    if (grid[i+1][j]==1) { sum--; }
                }
                sum += sum;
            }
        }
        return sum;
    }
}
