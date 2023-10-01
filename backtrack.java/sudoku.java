import java.util.*;
public class sudoku {
    public static void main (String Args []) {
       int sudoku[][] = {{0,0,8,0,0,0,0,0,0} , 
     {4,9,0,1,5,7,0,0,2},{0,0,3,0,0,4,1,9,0},{1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0} ,
     {9,6,0,4,0,5,3,0,0}, {0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
    }
    public static boolean isSafe(int sudoku[][], int row , int col , int digit) {
        for(int i=0;i<=9;i++) { //for checking if the digit is present in that row
            if(sudoku[row][i]==digit) {
                return false;
            }
        }
        for(int j=0;j<=9;j++) { //for checking if the digit is present in that column
            if (sudoku[j][col]==digit) {
              return false;
            }
        }
        for(int i=row;i<row+3;i++) {
            for(int j=col;j<col+3;j++) {
                if(sudoku[i][j]==digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][] , int row , int col) {
        //BASE CASE
        if(row==9 && col==9) {
            return true;
        } else if(row==9) {
            return false;
        }
        //RECURSION
        int nextrow = row , nextcol =  col+1;
        if(col+1==9) { //last column is reached 
            nextrow = row+1;
            nextcol = 0;
        }
        if(sudoku[row][col] !=0) {
            return sudokuSolver(sudoku, nextrow, nextcol);
        }
        for(int digit = 1;digit<=9;digit++) {
            if(isSafe(sudoku,row,col,digit)) {
                sudoku[row][col] = digit;
               if( sudokuSolver(sudoku, nextrow, nextcol)){
                return true;
               }
               sudoku[row][col] = 0;
            }
        }
        return false;
    }
}
