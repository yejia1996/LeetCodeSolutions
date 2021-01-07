package LeetCode;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (search(board, word, row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int row, int col, int curLength) {
        boolean[][] marked = new boolean[board.length][board[0].length];
        if (curLength == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length ||
                col < 0 || col >= board[0].length ||
                board[row][col] != word.charAt(curLength)) {
            return false;
        }
        board[row][col] += 256;
        boolean result = search(board, word, row-1, col, curLength+1) ||
                search(board, word, row+1, col, curLength+1) ||
                search(board, word, row, col+1, curLength+1) ||
                search(board, word, row, col-1, curLength+1);
        board[row][col] -= 256;
        return result;
    }
}
