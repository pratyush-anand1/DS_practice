import java.util.*;

public class fact {
    public static void main(String Args []) {
      //System.out.println(factorial(4));
      System.out.println(first_n(5));
    }
    public static int factorial (int n) {
        if(n==1) {
          return 1;
        }
        return n*factorial(n-1);
    }
    public static void first_n (int n) {
       Long  sum = 0L;
        if(n==0) {
            return ;
        }
        sum+=n;
        first_n(n-1);
        
    }
}
