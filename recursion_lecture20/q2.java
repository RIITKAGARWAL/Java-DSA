// n queens in n by n chess blocks
// placed such as all n queens are safe from each other

import java.util.ArrayList;
import java.util.List;

public class q2 {
    public static boolean isSafe(char[][] board, int row, int col) {
        int r = row;
        int c = col;

        // horizontal
        for (c = 0; c < board[row].length; c++) {
            if (board[row][c] == 'Q')
                return false;
        }

        // vertical
        for (r = 0; r < board.length; r++) {
            if (board[col][r] == 'Q')
                return false;
        }

        // upper left
        r = row;
        c = col;
        for (; r >= 0 && c >= 0; r--, c--)
            if (board[r][c] == 'Q')
                return false;

        // upper right
        r = row;
        c = col;
        for (; r >= 0 && c < board[row].length; r--, c++)
            if (board[r][c] == 'Q')
                return false;

        // lower left
        r = row;
        c = col;
        for (; r < board.length && c >= 0; r++, c--)
            if (board[r][c] == 'Q')
                return false;

        // lower right
        r = row;
        c = col;
        for (; r < board.length && c < board[row].length; r++, c++)
            if (board[r][c] == 'Q')
                return false;

        return true;
    }
    public  static void saveBoard(char[][] board,List<List<String>> allBoards){

        String rows;
        List <String> boardji= new ArrayList<>();
        
        for(int row=0; row<board.length;row++){
            rows = "";
            for(int col=0;col<board.length; col++){
                if(board[row][col]=='Q')
                    rows += 'Q';
                else
                    rows += '.';
            }
            boardji.add(rows);
        }
        allBoards.add(boardji);

    }
    public static void placeQueen(char[][] board,List<List<String>> allBoards, int col){
        if(board.length == col){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0; row<board.length;row++){
            if(isSafe(board,row,col))
                 board[row][col] = 'Q';
                 placeQueen(board,allBoards, col+1); 
                 board[row][col] = '.';
                }

    }
    public static List<List<String>> QueenSafe(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        placeQueen(board,allBoards,0)

        return allBoards;
    }

    public static void main(String args[]) {
        QueenSafe(4);
      
    }
}
