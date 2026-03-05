package Recursion;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValid(board));


    }
    public static boolean isValid(char[][] board){
        int n=board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    if(!isSafe(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int j = 0; j < 9; j++) {
            if (j!=col&&board[row][j] == digit) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i!=row&&board[i][col] == digit) {
                return false;
            }
        }
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if ((i != row || j != col)&&board[i][j] == digit)
                    return false;
            }
        }

        return true;
    }

}
