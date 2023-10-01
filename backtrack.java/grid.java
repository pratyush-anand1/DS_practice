import java.util.*;
public class grid {
    public static void main(String Args []) {
          int n =3;
          int m = 3;
       System.out.println(grid_ways(0, 0, n, m));
    }
    public static  int grid_ways(int i , int j , int n , int m) {
        //BASE CASE
        if(i==n-1 && j==m-1) { //CONDITION WHERE SOURCE AD TARGET ARE SAME 
           return 1;
        } else if(i==n || j==m) { //BOUNDARY CROSS CONDITION
            return 0;
        }
        int w1 = grid_ways(i+1, j, n, m);
        int w2 = grid_ways(i, j+1, n, m);
        return w1+w2;
}
}
