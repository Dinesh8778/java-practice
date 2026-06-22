class Solution {
    int ans = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] c : board) {
            Arrays.fill(c, '.');
        }
        boolean[] rows = new boolean[n];
        boolean[] leftd = new boolean[2 * n - 1];
        boolean[] rightd = new boolean[2 * n - 1];
        solve(0, board, rows, leftd, rightd, n);
        return ans;
    }

    public void solve(int col, char[][] board, boolean[] rows, boolean[] leftd, boolean[] rightd, int n) {
        if (col == n) {
            ans++;
            return;
        }
        for (int row = 0; row < n; row++) {
            int d1 = row + col;
            int d2 = n - 1 + row - col;
            if (rows[row] || leftd[d1] || rightd[d2])
                continue;
            rows[row] = true;
            board[row][col] = 'Q';
            leftd[d1] = true;
            rightd[d2] = true;
            solve(col + 1, board, rows, leftd, rightd, n);
            rows[row] = false;
            board[row][col] = '.';
            leftd[d1] = false;
            rightd[d2] = false;
        }
    }
}