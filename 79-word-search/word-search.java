class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == word.charAt(0)) {
                    if (check(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board, String word,
                         int i, int j, int k) {

        if (k == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 ||
            i >= board.length || j >= board[0].length) {
            return false;
        }

        if (board[i][j] != word.charAt(k)) {
            return false;
        }

        char ch = board[i][j];
        board[i][j] = '#';

        boolean ans = check(board, word, i + 1, j, k + 1)
                    || check(board, word, i - 1, j, k + 1)
                    || check(board, word, i, j + 1, k + 1)
                    || check(board, word, i, j - 1, k + 1);

        board[i][j] = ch;

        return ans;
    }
}