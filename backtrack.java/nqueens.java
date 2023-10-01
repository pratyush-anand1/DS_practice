import java.util.*;

public class nqueens {
     public static void main(String Args []) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++) {  //INTIALIZE
            for(int j=0;j<n;j++) {
                board[i][j] = 'x'; //INITIALLY EMPTY
            }
        }
        n_queens(board,0);
     }
     public static void n_queens(char board[][] , int row) {
        if(row==board.length) {  //BASE CASE
            printboard(board);
            return;
        }
        for(int j=0;j<board.length;j++) {
           if(isSafe(board, row, j)) {
            board[row][j] = 'Q';
            n_queens(board, row+1); //FUNCTION CALL
            board[row][j] = 'x'; //BACKTRACK
           }
        }
     }
     public static void printboard(char board[][]) {
        System.out.println("-------CHESS BOARD--------");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
       
     }
     public static boolean isSafe(char board[][], int row , int col) {
        //VERTICAL UP
        for(int i=row-1;i>=0;i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //DIAGONAL LEFT UP
        for(int i=row-1,j=col-1 ; i>=0 && j>=0; i-- , j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //DIAGONAL RIGHT UP
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length;i-- , j++) {
            if(board[i][j] == 'Q') {
                return false; 
            }
        }
        return true;
     }
}
