import java.util.*;
public class diagonalsum  {
   public static int diagonal_sum(int matrix [][]) {
    int s=0;
    ;
    for(int i=0;i<matrix.length;i++) {
        for(int j=0;j<matrix[0].length;j++) {
            if(i==j | i+j==matrix.length-1) {
                s +=matrix[i][j];
            }
        }
    }
    return s;
    
   } 
   public static void main(String Args[]) {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int [3][3];
    System.out.println("Enter the elements of first row followed by other rows\n");
    for(int i=0;i<matrix.length;i++) {
        for(int j=0;j<matrix[0].length;j++) {
            matrix[i][j]= sc.nextInt();
        }
    }
    System.out.println(diagonal_sum(matrix));
   }
}
