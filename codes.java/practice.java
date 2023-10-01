import java.util.*;
public class practice {
    public static int Count(int mat[][]) {
        int count=0;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j]==7) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int sum (int mat[][]) {
        int Sum=0;
        for(int k=0;k<mat[0].length;k++) {
            Sum +=mat[1][k];
        }
        return Sum;
    }
   
    public static void main(String Args []) {
        int mat[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sum(mat));

    }
}
