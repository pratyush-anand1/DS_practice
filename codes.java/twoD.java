import java.util.*;
public class twoD {
    public static void spiral (int matrix [][]) {
      int startrow = 0;
      int startcol=0;
      int endrow = matrix.length-1;
      int endcol = matrix[0].length-1;
      while(startrow<=endrow && startcol<=endcol) {
        //top
        for(int j=startcol;j<=endcol;j++) {
            System.out.println(matrix[startrow][j]+" ");

        }
        //right 
        for(int j=startrow+1;j<=endrow;j++) {
            System.out.println(matrix[j][endcol]+" ");
        }
        //bottom
        for(int j=endcol-1;j>=startcol;j--) {
            if(startrow==endrow) { //condition so that the elements which are already printed are not printed again
                break;
            }
            System.out.println(matrix[endrow][j]+" ");
        }
        //left
        for(int i=endrow-1;i>startrow;i--) {
            if(startcol==endcol) {
                break;
            }
            System.out.println(matrix[i][startcol]+" ");
        }
        startrow++;
        startcol++;
        endrow--;
        endcol--;
      }
    }
    public static void main(String Args []) {
        int matrix [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(matrix);
    }
}