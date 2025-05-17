
package model;

public class SudokuBoard {
    public SudokuCell[][] board;

    public SudokuBoard() {
        board = new SudokuCell[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = new SudokuCell();
            }
        }
    }

    public void insertNumber(int row, int col, int number) {
        if (!board[row][col].isFixed) {
            board[row][col].value = number;
            board[row][col].isUserInput = true;
        }
    }

    public void insertDraft(int row, int col, int number) {
        if (!board[row][col].isFixed && board[row][col].value == 0) {
            board[row][col].draftValues.add(number);
        }
    }

    public void removeNumber(int row, int col) {
        if (!board[row][col].isFixed) {
            board[row][col].value = 0;
            board[row][col].isUserInput = false;
            board[row][col].draftValues.clear();
        }
    }

    public void clearUserInputs() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j].isUserInput) {
                    board[i][j].value = 0;
                    board[i][j].isUserInput = false;
                    board[i][j].draftValues.clear();
                }
            }
        }
    }

    public boolean isComplete() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j].value == 0 || !isValidMove(i, j, board[i][j].value)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidMove(int row, int col, int num) {
        if (num == 0) return true;
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i].value == num) return false;
            if (i != row && board[i][col].value == num) return false;
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if ((i != row || j != col) && board[i][j].value == num) return false;
            }
        }
        return true;
    }
}
